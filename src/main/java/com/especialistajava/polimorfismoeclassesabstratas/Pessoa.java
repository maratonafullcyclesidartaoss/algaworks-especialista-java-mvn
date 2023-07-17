package com.especialistajava.polimorfismoeclassesabstratas;

public abstract class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o nome");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularImpostos();
}
