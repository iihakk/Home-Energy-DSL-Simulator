package org.homeenergy.runtime;

import org.homeenergy.hemDsl.*;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Engine {
    private final Map<String, Appliance> appliances = new LinkedHashMap<>();
    private final List<Rule> rules;

    public Engine(Model model) {
        for (Element e : model.getElements()) {
            if (e instanceof Declaration d) {
                appliances.put(
                    d.getName(),
                    new Appliance(d.getName(),
                                  ApplianceType.valueOf(d.getType().getName()))
                );
            }
        }
        rules = model.getElements().stream()
                     .filter(Rule.class::isInstance)
                     .map(Rule.class::cast)
                     .toList();
    }

    public void tick(TickContext ctx) {
        for (Rule r : rules) {
            if (eval(r.getCondition(), ctx)) {
                exec(r.getThenAction());
                return;
            } else if (r.getElseAction() != null) {
                exec(r.getElseAction());
                return;
            }
        }
    }

    // —— dispatch from Expr to OrExpr
    private boolean eval(Expr expr, TickContext ctx) {
        return evalOr(expr.getOrExpr(), ctx);
    }

    private boolean evalOr(OrExpr or, TickContext ctx) {
        if (evalAnd(or.getLeft(), ctx)) return true;
        for (AndExpr a : or.getRight()) {
            if (evalAnd(a, ctx)) return true;
        }
        return false;
    }

    private boolean evalAnd(AndExpr and, TickContext ctx) {
        if (!evalPrim(and.getLeft(), ctx)) return false;
        for (Prim p : and.getRight()) {
            if (!evalPrim(p, ctx)) return false;
        }
        return true;
    }

    private boolean evalPrim(Prim p, TickContext ctx) {
        if (p.getTimeCond() != null)  return evalTimeCond(p.getTimeCond(), ctx);
        if (p.getPriceCond() != null) return evalPriceCond(p.getPriceCond(), ctx);
        if (p.getOccCond() != null)   return evalOccCond(p.getOccCond(), ctx);
        if (p.getSubExpr() != null)   return eval(p.getSubExpr(), ctx);
        throw new IllegalArgumentException("Unknown Prim variant: " + p);
    }

    private void exec(Action act) {
        if (act instanceof TurnAction ta) {
            Appliance a = appliances.get(ta.getAppliance().getName());
            a.setOn("on".equals(ta.getAction()));
        } else if (act instanceof SetAction sa) {
            Appliance a = appliances.get(sa.getAppliance().getName());
            a.setLevel(Double.parseDouble(sa.getValue()));
        }
    }

    public String statusLine() {
        return appliances.values().stream()
            .map(a -> a.getName() + ":" + (a.isOn() ? "ON" : "OFF"))
            .reduce((x,y)->x+" "+y).orElse("");
    }

    // ──────────── Condition helpers ────────────

    private boolean evalTimeCond(TimeCond tc, TickContext ctx) {
        LocalTime now = ctx.time();
        if (tc.getTime() != null) {
            LocalTime t = LocalTime.parse(tc.getTime());
            return now.equals(t);
        } else {
            LocalTime start = LocalTime.parse(tc.getStart());
            LocalTime end   = LocalTime.parse(tc.getEnd());
            return !now.isBefore(start) && !now.isAfter(end);
        }
    }

    private boolean evalPriceCond(PriceCond pc, TickContext ctx) {
        double price     = ctx.price();
        double threshold = Double.parseDouble(pc.getValue());
        return switch(pc.getOp()) {
            case ">"  -> price >  threshold;
            case "<"  -> price <  threshold;
            case ">=" -> price >= threshold;
            case "<=" -> price <= threshold;
            case "==" -> price == threshold;
            case "!=" -> price != threshold;
            default   -> throw new IllegalArgumentException(pc.getOp());
        };
    }

    private boolean evalOccCond(OccCond oc, TickContext ctx) {
        int occ          = ctx.occupancy();
        int threshold    = oc.getValue();  // INT is generated as int
        return switch(oc.getOp()) {
            case ">"  -> occ >  threshold;
            case "<"  -> occ <  threshold;
            case ">=" -> occ >= threshold;
            case "<=" -> occ <= threshold;
            case "==" -> occ == threshold;
            case "!=" -> occ != threshold;
            default   -> throw new IllegalArgumentException(oc.getOp());
        };
    }
}
