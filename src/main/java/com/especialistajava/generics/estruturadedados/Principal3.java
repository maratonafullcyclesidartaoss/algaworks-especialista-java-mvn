package com.especialistajava.generics.estruturadedados;

import java.util.ArrayList;
import java.util.List;

public class Principal3 {

    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();
        numeros.add(20d);
        numeros.add(10d);
        numeros.add(21d);

        System.out.println(calcularMedia(numeros));

        List<Integer> numeros2 = new ArrayList<>();
        numeros2.add(20);
        numeros2.add(10);
        numeros2.add(21);

        System.out.println(calcularMedia(numeros2));
    }

    private static double calcularMedia(List<? extends Number> numeros) {
        double total = 0;

        for (Number numero : numeros) {
            total += numero.doubleValue();
        }

        return total / numeros.size();
    }
}
