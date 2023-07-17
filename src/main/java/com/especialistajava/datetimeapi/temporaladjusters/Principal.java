package com.especialistajava.datetimeapi.temporaladjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Principal {

    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);

        LocalDate primeiraSegundaProximoMes = dataHoje
            .plusMonths(1)
            .with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY));

        System.out.println(primeiraSegundaProximoMes);

        LocalDate dataUltimoDiaDoMes = dataHoje.with(TemporalAdjusters
            .lastDayOfMonth());
        System.out.println(dataUltimoDiaDoMes);

        LocalDate dataProximaSextaFeira = dataHoje.with(TemporalAdjusters
            .nextOrSame(DayOfWeek.FRIDAY));

        System.out.println(dataProximaSextaFeira);
    }
}
