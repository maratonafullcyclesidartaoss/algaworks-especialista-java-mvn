package com.especialistajava.optional;

import java.util.Objects;
import java.util.Optional;

public class Cliente {

    private final String nome;
    private Endereco endereco;

    public Cliente(String nome) {
        Objects.requireNonNull(nome);
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        this.nome = nome;
    }

    public Cliente(String nome, Endereco endereco) {
        this(nome);
        Objects.requireNonNull(endereco);
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Optional<Endereco> getEndereco() {
        return Optional.ofNullable(endereco);
    }
}
