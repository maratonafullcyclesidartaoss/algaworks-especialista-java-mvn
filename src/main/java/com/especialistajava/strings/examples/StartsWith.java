package com.especialistajava.strings.examples;

public class StartsWith {

    public static void main(String[] args) {
        String nome1 = "João";

        // false
//        System.out.println(nome1.startsWith("j"));

        // true
//        System.out.println(nome1.startsWith("J"));

        // false
//        System.out.println(nome1.startsWith("o"));

        // true
//        System.out.println(nome1.startsWith("Jo"));

        // false
//        System.out.println(nome1.startsWith("JO"));

        // true
        System.out.println(nome1.startsWith("João"));
    }
}
