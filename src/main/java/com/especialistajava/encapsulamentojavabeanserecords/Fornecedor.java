package com.especialistajava.encapsulamentojavabeanserecords;

public class Fornecedor {

    private String nome;

    public Fornecedor() {
    }

    public Fornecedor(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o nome");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}