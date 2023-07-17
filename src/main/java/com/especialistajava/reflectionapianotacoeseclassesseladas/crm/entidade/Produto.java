package com.especialistajava.reflectionapianotacoeseclassesseladas.crm.entidade;

import com.especialistajava.reflectionapianotacoeseclassesseladas.csv.Campo;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {

    @Campo
    private final Long codigo;
    @Campo(maiusculo = true)
    private String descricao;
    @Campo
    private BigDecimal precoUnitario;
    private Integer quantidadeEstoque;

    public Produto(Long codigo, String descricao, BigDecimal precoUnitario, Integer quantidadeEstoque) {
        Objects.requireNonNull(codigo);
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("Informe a descrição.");
        }
        Objects.requireNonNull(precoUnitario);
        Objects.requireNonNull(quantidadeEstoque);
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
