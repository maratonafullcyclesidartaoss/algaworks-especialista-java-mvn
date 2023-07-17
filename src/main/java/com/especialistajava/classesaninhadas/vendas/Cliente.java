package com.especialistajava.classesaninhadas.vendas;

public class Cliente {

    private final String nome;

    public Cliente(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
