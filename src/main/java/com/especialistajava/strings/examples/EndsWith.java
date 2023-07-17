package com.especialistajava.strings.examples;

public class EndsWith {

    public static void main(String[] args) {
        String nome1 = "João";

        // true
//        System.out.println(nome1.endsWith("o"));

        // false
//        System.out.println(nome1.endsWith("ãO"));

        // true
//        System.out.println(nome1.endsWith("ão"));

        // false
//        System.out.println(nome1.endsWith("Jo"));

        // true
        System.out.println(nome1.endsWith("João"));
    }
}
