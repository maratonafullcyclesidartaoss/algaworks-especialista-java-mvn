package com.especialistajava.mergulhandoorientacaoobjetos;

public class IndiceMassaCorporal {

    double peso;
    double altura;
    double resultado;

    void medir() {
        this.resultado =  this.peso / (this.altura * this.altura);
    }

    boolean estaComObesidade() {
        return this.resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal() {
        return this.resultado < 18.5;
    }
}