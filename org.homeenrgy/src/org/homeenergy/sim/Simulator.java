package org.homeenergy.sim;

import org.homeenergy.runtime.Engine;
import org.homeenergy.runtime.TickContext;
import org.homeenergy.hemDsl.Model;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Drives the Engine through a 24-hour day in 1-minute ticks.
 */
public class Simulator {
    private final Engine engine;
    private final PriceModel priceModel   = new PriceModel();
    private final OccupancyModel occModel = new OccupancyModel();
    private final List<String> log        = new ArrayList<>();

    public Simulator(Model model) {
        this.engine = new Engine(model);
    }

    /** Run 1440 one-minute steps and record appliance states. */
    public void runDay() {
        LocalTime t = LocalTime.MIDNIGHT;
        for (int i = 0; i < 24 * 60; i++, t = t.plusMinutes(1)) {
            double price = priceModel.priceAt(t);
            int occ      = occModel.occupantsAt(t);
            engine.tick(new TickContext(t, price, occ));
            log.add(String.format("%02d:%02d price=%.2f occ=%d  %s",
                  t.getHour(), t.getMinute(), price, occ,
                  engine.statusLine()));
        }
    }

    /** Print the recorded log to stdout/console. */
    public void dumpLog() {
        log.forEach(System.out::println);
    }
}
