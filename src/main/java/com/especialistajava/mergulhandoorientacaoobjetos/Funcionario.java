package com.especialistajava.mergulhandoorientacaoobjetos;

public class Funcionario {

    String nome;
    int quantidadeFilhos;

    boolean possuiFilhos() {
        return this.quantidadeFilhos > 0;
    }
}