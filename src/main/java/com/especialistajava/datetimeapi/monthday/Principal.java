package com.especialistajava.datetimeapi.monthday;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Principal {

    public static void main(String[] args) {
//        MonthDay diaMesAtual = MonthDay.now();
//        System.out.println(diaMesAtual);

        MonthDay diaAniversario = MonthDay.of(Month.SEPTEMBER, 13);
        System.out.println(diaAniversario);

        MonthDay diaMes = MonthDay.from(LocalDate.now());

        System.out.println(diaMes);

        MonthDay diaMes2 = MonthDay.parse("--09-13");
        System.out.println(diaMes2);

//        LocalDate dataAniversario = diaMes2.atYear(2023);
//        System.out.println(dataAniversario);

        LocalDate dataAniversario = Year.now().atMonthDay(diaMes2);
        System.out.println(dataAniversario);
    }
}
