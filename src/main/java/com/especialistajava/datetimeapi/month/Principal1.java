package com.especialistajava.datetimeapi.month;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Principal1 {

    public static void main(String[] args) {
//        Month mes = Month.SEPTEMBER;

      Month mes = Month.of(9);
        System.out.println(mes);

//        LocalDate dataNascimento = LocalDate.parse("1977-11-03");
        LocalDate dataNascimento = LocalDate.of(1977, Month.NOVEMBER, 03);

//        Month mesNascimento = Month.from(dataNascimento);
        Month mesNascimento = dataNascimento.getMonth();
        System.out.println(mesNascimento);

        System.out.println(mesNascimento.getDisplayName(TextStyle.FULL,
            new Locale("pt", "BR")));

        System.out.println(DateTimeFormatter.ofPattern("MMMM")
            .withLocale(new Locale("pt", "BR"))
            .format(mesNascimento));
    }
}
