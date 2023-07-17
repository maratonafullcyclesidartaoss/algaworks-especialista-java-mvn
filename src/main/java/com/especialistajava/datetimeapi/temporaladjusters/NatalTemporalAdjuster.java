package com.especialistajava.datetimeapi.temporaladjusters;

import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.util.Objects;

public class NatalTemporalAdjuster implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        Objects.requireNonNull(temporal);
        return temporal.with(ChronoField.DAY_OF_MONTH, 25)
            .with(ChronoField.MONTH_OF_YEAR, Month.DECEMBER.getValue());
    }
}
