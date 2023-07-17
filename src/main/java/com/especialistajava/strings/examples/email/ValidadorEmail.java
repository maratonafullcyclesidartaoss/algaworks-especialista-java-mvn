package com.especialistajava.strings.examples.email;

import java.util.regex.Pattern;

public class ValidadorEmail {

    public static boolean validar(String email) {
        return email.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}");
    }

    public static void main(String[] args) {
//        char c = 'T';

//        System.out.println(Character.isLetter(c));
//        System.out.println(Character.isLowerCase(c));
//        System.out.println(Character.isDigit(c));
        String email = " joao@doe.com";

        boolean valido = Pattern.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}", email);
        System.out.println(valido);

        System.out.println(email.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}"));
    }
}
