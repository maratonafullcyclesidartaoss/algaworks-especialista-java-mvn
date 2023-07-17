package com.especialistajava.collections.colecoesimutaveis;

import java.util.Collections;
import java.util.List;

public class TesteEmptyList {

    public static void main(String[] args) {
        List<Integer> numeros = Collections.emptyList();
        numeros.add(0);
        System.out.println(numeros);
    }
}
