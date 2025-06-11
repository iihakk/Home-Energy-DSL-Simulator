package org.homeenergy.runtime;

import java.time.LocalTime;

public record TickContext(LocalTime time, double price, int occupancy) { }
