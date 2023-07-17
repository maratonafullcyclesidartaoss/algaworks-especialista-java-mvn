package com.especialistajava.datetimeapi.objetostemporais;

import java.time.LocalDate;

public class Principal4 {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate semanaPassada = hoje.minusWeeks(1);

        System.out.println(hoje);
        System.out.println(semanaPassada);
    }
}
