package com.especialistajava.datetimeapi.dayofweek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
//        DayOfWeek diaDaSemana = DayOfWeek.MONDAY;
//        System.out.println(diaDaSemana);

//        DayOfWeek diaDaSamana = DayOfWeek.of(1);

//        DayOfWeek diaDaSamana = DayOfWeek.from(LocalDate.now());
        DayOfWeek diaDaSamana = LocalDate.now().getDayOfWeek();
        System.out.println(diaDaSamana);

        System.out.println(diaDaSamana.getDisplayName(TextStyle.FULL,
            new Locale("pt", "BR")));

//        System.out.println(DateTimeFormatter.ofPattern("EEEE")
//            .withLocale(new Locale("pt", "BR"))
//            .format(diaDaSamana));
    }
}
