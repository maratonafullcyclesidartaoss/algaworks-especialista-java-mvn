package com.especialistajava.datetimeapi.year;

import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Principal2 {

    public static void main(String[] args) {
        Year ano = Year.parse("2023");
//        Year anoFuturo = ano.plus(Period.parse("P10Y10M"));
        Year anoFuturo = ano.plus(Period.parse("P10Y"));
        System.out.println(anoFuturo);

        Year anoFuturo2 = ano.plus(10, ChronoUnit.CENTURIES);
        System.out.println(anoFuturo2);

        Year anoFuturo3 = ano.plusYears(3);
        System.out.println(anoFuturo3);
    }
}
