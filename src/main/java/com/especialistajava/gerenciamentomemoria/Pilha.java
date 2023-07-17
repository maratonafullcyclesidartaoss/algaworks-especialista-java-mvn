package com.especialistajava.gerenciamentomemoria;

import java.util.Arrays;

public class Pilha {

    public static final int CAPACIDADE_INICIAL_PADRAO = 4;

    Cliente[] elementos = new Cliente[CAPACIDADE_INICIAL_PADRAO];
    int tamanho = 0;

    void adicionar(Cliente elemento) {
        this.garantirCapacidade();
        this.elementos[tamanho++] = elemento;
    }

    Cliente retirar() {
        if (tamanho == 0) {
            return null;
        }

        Cliente elemento = elementos[--tamanho];
        elementos[tamanho] = null;

        return elemento;
    }

    void imprimirEstatisticas() {
        System.out.printf("Tamanho atual: %d%n", this.tamanho);
        System.out.printf("Capacidade: %d%n%n", this.elementos.length);
    }

    private void garantirCapacidade() {
        if (elementos.length == tamanho) {
            elementos = Arrays.copyOf(elementos, tamanho + 10);
        }
    }
}