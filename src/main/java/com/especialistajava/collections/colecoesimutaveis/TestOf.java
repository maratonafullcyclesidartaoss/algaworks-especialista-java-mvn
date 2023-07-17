package com.especialistajava.collections.colecoesimutaveis;

import java.util.List;

public class TestOf {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3);
        System.out.println(numeros);
        numeros.add(4);
    }
}
