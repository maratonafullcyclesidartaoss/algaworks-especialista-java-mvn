package com.especialistajava.datetimeapi.objetostemporais;

import java.time.LocalDate;

public class Principal6 {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate dataProximaParcela = hoje.plusDays(30);
        System.out.println(hoje);
        System.out.println(dataProximaParcela);
    }
}
