package com.especialistajava.reflectionapianotacoeseclassesseladas.crm.entidade;

import com.especialistajava.reflectionapianotacoeseclassesseladas.csv.Campo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Cliente {

    @Campo
    private final Long codigo;
    @Campo
    private final String nome;
    @Campo
    private final LocalDate dataNascimento;
    private final BigDecimal limiteCredito = BigDecimal.valueOf(12000);

    public Cliente(Long codigo, String nome, LocalDate dataNascimento) {
        Objects.requireNonNull(codigo);
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        Objects.requireNonNull(dataNascimento);
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
