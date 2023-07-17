package com.especialistajava.classesaninhadas.vendas2;

import java.util.Objects;

public class Cliente {

    private String nome;

    public Cliente(String nome) {
        setNome(nome);
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
