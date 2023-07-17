package com.especialistajava.strings.examples.expressoesregulares;

import java.util.Arrays;

public class Split {

    public static void main(String[] args) {
        String html = "joao@doe.com";
        String[] partes = html.split("[@.]");

        System.out.println(Arrays.toString(partes));
        System.out.println(partes[0] + " da " + partes[1]);
    }
}
