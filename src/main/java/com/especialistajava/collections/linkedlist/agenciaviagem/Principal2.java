package com.especialistajava.collections.linkedlist.agenciaviagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(8);
        numeros.add(30);
        numeros.add(1);

        Collections.sort(numeros);
        System.out.println(numeros);

        Collections.sort(numeros, Comparator.reverseOrder());
        System.out.println(numeros);
    }
}
