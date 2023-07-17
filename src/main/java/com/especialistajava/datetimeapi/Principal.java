package com.especialistajava.datetimeapi;

import java.time.Instant;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        System.out.println(new Date());
        Instant instante = Instant.now();

        System.out.println(instante);

        System.out.println(instante.getEpochSecond());
        System.out.println(instante.getNano());

        System.out.println(instante.toEpochMilli());
        System.out.println(System.currentTimeMillis());
    }
}
