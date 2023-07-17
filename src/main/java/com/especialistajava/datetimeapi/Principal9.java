package com.especialistajava.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Principal9 {

    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
//        LocalDate data = dataHora.toLocalDate();

        LocalDate data = LocalDate.from(dataHora);
//        LocalTime hora = dataHora.toLocalTime();

        LocalTime hora = LocalTime.from(dataHora);

        System.out.println(data);
        System.out.println(hora);
    }
}
