package com.especialistajava.datetimeapi;

import java.time.LocalDate;

public class Principal5 {

    public static void main(String[] args) {
//        LocalDate dataHoje = LocalDate.now();
//        System.out.println(dataHoje);

        LocalDate dataNascimento = LocalDate.of(1981, 9, 13);
        System.out.println(dataNascimento);

        LocalDate diaDoProgramador = LocalDate.ofYearDay(2023, 256);
        System.out.println(diaDoProgramador);
    }
}
