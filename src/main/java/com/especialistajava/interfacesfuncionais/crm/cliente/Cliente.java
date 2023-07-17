package com.especialistajava.interfacesfuncionais.crm.cliente;

import java.util.Objects;

public class Cliente {

    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        Objects.requireNonNull(nome);
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
