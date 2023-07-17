package com.especialistajava.serializacaodeobjetos;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Cliente implements Serializable {

    @Serial
    private static final long serialVersionUID = -9134823172346366413L;

    private String nome;
    private final Endereco endereco;
    private BigDecimal limiteCredito;

    public Cliente(String nome, Endereco endereco, BigDecimal limiteCredito) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        Objects.requireNonNull(endereco);
        Objects.requireNonNull(limiteCredito);
        this.nome = nome;
        this.endereco = endereco;
        this.limiteCredito = limiteCredito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
            "nome='" + nome + '\'' +
            ", endereco=" + endereco +
            ", limiteCredito=" + limiteCredito +
            '}';
    }
}
