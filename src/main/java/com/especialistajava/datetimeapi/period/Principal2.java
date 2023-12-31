package com.especialistajava.datetimeapi.period;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Principal2 {

    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.parse("2023-09-15");
        LocalDate dataEntrega = LocalDate.parse("2023-11-12");

//        Period tempoEntrega = Period.between(dataCompra, dataEntrega);
        Period tempoEntrega = dataCompra.until(dataEntrega);
        System.out.println(tempoEntrega);

//        long tempoEntregaSemanas = dataCompra.until(dataEntrega, ChronoUnit.WEEKS);
//        System.out.printf("%d semanas%n", tempoEntregaSemanas);

        long tempoEntregaSemanas = ChronoUnit.WEEKS.between(dataCompra, dataEntrega);
        System.out.printf("%d semanas%n", tempoEntregaSemanas);
    }
}
