package com.especialistajava.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal12 {

    public static void main(String[] args) {
//        LocalDate data = LocalDate.parse("2026-10-03");
//        LocalDate data = LocalDate.parse("03/10/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(data);

//        LocalTime data = LocalTime.parse("21:23:19");
//        System.out.println(data);

//        LocalDateTime dataHora = LocalDateTime.parse("2016-10-03T21:03:19");
        LocalDateTime dataHora = LocalDateTime.parse("03/10/2023 21:03:19",
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println(dataHora);
    }
}
