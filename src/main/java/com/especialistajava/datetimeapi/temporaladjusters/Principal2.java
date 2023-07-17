package com.especialistajava.datetimeapi.temporaladjusters;

import org.w3c.dom.CDATASection;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Principal2 {

    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);

        LocalDate dataNatal = dataHoje.with(new NatalTemporalAdjuster());
        System.out.println(dataNatal);
    }
}
