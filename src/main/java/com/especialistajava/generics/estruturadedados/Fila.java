package com.especialistajava.generics.estruturadedados;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> implements Colecao<T> {

    private final List<T> itens;

    public Fila() {
        this.itens = new ArrayList<>();
    }

    public List<T> getItens() {
        return itens;
    }

    public void colocar(T t) {
        this.itens.add(t);
    }

    public T retirar() {
        if (this.itens.isEmpty()) {
            throw new ColecaoVaziaException("Coleção sem itens.");
        }
        return this.itens.remove(0);
    }
}
