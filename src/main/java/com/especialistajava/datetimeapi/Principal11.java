package com.especialistajava.datetimeapi;

import java.time.Instant;

public class Principal11 {

    public static void main(String[] args) {
//        Instant instante = Instant.parse("2010-08-20T19:45:05-00:00");
//        Instant instante = Instant.parse("2010-08-20T19:45:05Z");
        Instant instante = Instant.parse("2010-08-20T19:45:05-03:00");
        System.out.println(instante);
    }
}
