package com.especialistajava.heranca.banco;

import java.util.Objects;

public class Titular {

    private String nome;
    private final String cpf;

    public Titular(String nome, String cpf) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o CPF.");
        }
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Titular{" +
            "nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            '}';
    }
}