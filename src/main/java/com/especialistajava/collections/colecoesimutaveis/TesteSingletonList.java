package com.especialistajava.collections.colecoesimutaveis;

import java.util.Collections;
import java.util.List;

public class TesteSingletonList {

    public static void main(String[] args) {
        List<Integer> numeros = Collections.singletonList(1);
        numeros.add(0);
        System.out.println(numeros);
    }
}
