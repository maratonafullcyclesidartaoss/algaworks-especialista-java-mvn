package com.especialistajava.generics.estruturadedados;

public interface Colecao<T> {

    void colocar(T item);
    T retirar();
}
