package org.homeenergy.sim;

import java.time.LocalTime;

/**
 * Simple time‐of‐use price curve:
 *  - Off‐peak: 00:00–07:59 ⇒ $0.10
 *  - Shoulder: 08:00–16:59 ⇒ $0.18
 *  - Peak:     17:00–19:59 ⇒ $0.28
 *  - Off‐peak again: 20:00–23:59
 */
public class PriceModel {
    public double priceAt(LocalTime t) {
        int h = t.getHour();
        if (h >= 17 && h < 20)    return 0.28;
        else if (h >= 8 && h < 17) return 0.18;
        else                       return 0.10;
    }
}
