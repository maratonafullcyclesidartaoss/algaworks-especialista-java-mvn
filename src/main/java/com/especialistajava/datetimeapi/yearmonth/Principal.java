package com.especialistajava.datetimeapi.yearmonth;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class Principal {

    public static void main(String[] args) {
//        YearMonth anoMes = YearMonth.now();

//        YearMonth anoMes = YearMonth.of(2023, Month.JULY);

//        YearMonth anoMes = YearMonth.from(LocalDate.now());

        YearMonth anoMes = YearMonth.parse("2023-07");

        LocalDate dataAniversario = anoMes.atDay(10);

        System.out.println(anoMes);
        System.out.println(dataAniversario);

        LocalDate dataUltimoDiaDoMes = anoMes.atEndOfMonth();
        System.out.println(dataUltimoDiaDoMes);
    }
}
