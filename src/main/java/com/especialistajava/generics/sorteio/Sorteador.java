package com.especialistajava.generics.sorteio;

import java.util.Random;

public class Sorteador {

    private static final Random RANDOM = new Random();

    public static <T> T sortear(T[] clientes) {
        if (clientes.length == 0) {
            throw new IllegalArgumentException("Mínimo de um cliente requerido");
        }
        int posicao = RANDOM.nextInt(clientes.length);
        return clientes[posicao];
    }
}
