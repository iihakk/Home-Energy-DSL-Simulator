package org.homeenergy.runtime;

public class Appliance {
    private final String name;
    private final ApplianceType type;
    private boolean on = false;
    private Double level = null;

    public Appliance(String name, ApplianceType type) {
        this.name = name;
        this.type = type;
    }
    public String getName() { return name; }
    public ApplianceType getType() { return type; }
    public boolean isOn() { return on; }
    public void setOn(boolean on) { this.on = on; }
    public Double getLevel() { return level; }
    public void setLevel(Double level) { this.level = level; }
}
