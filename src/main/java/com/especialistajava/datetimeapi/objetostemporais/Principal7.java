package com.especialistajava.datetimeapi.objetostemporais;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Principal7 {

    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();

//        LocalDate dataProximaParcela = agora.plusDays(30);
//        LocalDate dataProximaParcela = agora.plus(30, ChronoUnit.DAYS);

//        LocalDate dataProximaParcela = ChronoUnit.DAYS.addTo(agora, 30);
        LocalDate dataProximaParcela = agora.plusDays(30);
        LocalDate dataDecadaPassada = agora.minus(1, ChronoUnit.DECADES);

        System.out.println(agora);
        System.out.println(dataProximaParcela);
        System.out.println(dataDecadaPassada);
    }
}
