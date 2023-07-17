package com.especialistajava.lancandoexcecoes.cliente.model;

public class Cliente {

    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome deve ser informado.");
        }
        if (idade <= 0) {
            throw new IllegalArgumentException("A idade não pode ser igual a zero ou negativa.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
