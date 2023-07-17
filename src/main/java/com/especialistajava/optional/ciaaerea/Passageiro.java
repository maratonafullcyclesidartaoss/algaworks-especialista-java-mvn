package com.especialistajava.optional.ciaaerea;

import java.util.Objects;

public class Passageiro {

    private String nome;

    public Passageiro(String nome) {
        Objects.requireNonNull(nome);
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
            "nome='" + nome + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passageiro that = (Passageiro) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
