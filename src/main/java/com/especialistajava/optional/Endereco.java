package com.especialistajava.optional;

import java.util.Objects;
import java.util.Optional;

public class Endereco {

    private final String logradouro;
    private final String numero;
    private final String bairro;
    private Cidade cidade;
    private boolean residenciaPropria;

    public Endereco(String logradouro, String numero, String bairro) {
        Objects.requireNonNull(logradouro);
        Objects.requireNonNull(numero);
        Objects.requireNonNull(bairro);
        if (logradouro.isBlank()) {
            throw new IllegalArgumentException("Informe o logradouro.");
        }
        if (numero.isBlank()) {
            throw new IllegalArgumentException("Informe o número.");
        }
        if (bairro.isBlank()) {
            throw new IllegalArgumentException("Informe o bairro.");
        }
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Endereco(String logradouro, String numero, String bairro, Cidade cidade) {
        this(logradouro, numero, bairro);
        Objects.requireNonNull(cidade);
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public boolean isResidenciaPropria() {
        return residenciaPropria;
    }

    public void setResidenciaPropria(boolean residenciaPropria) {
        this.residenciaPropria = residenciaPropria;
    }

    public Optional<Cidade> getCidade() {
        return Optional.ofNullable(cidade);
    }
}
