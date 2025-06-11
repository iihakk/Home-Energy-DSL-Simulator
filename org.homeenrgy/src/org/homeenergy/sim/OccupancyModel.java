package org.homeenergy.sim;

import java.time.LocalTime;

/**
 * Simple occupancy: one occupant
 * between 06:00–07:59 and 17:00–23:59, zero otherwise.
 */
public class OccupancyModel {
    public int occupantsAt(LocalTime t) {
        int h = t.getHour();
        if ((h >= 6 && h < 8) || (h >= 17 && h < 24)) {
            return 1;
        } else {
            return 0;
        }
    }
}
