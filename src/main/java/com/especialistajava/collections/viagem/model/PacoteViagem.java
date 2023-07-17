package com.especialistajava.collections.viagem.model;

import java.util.Objects;

public class PacoteViagem implements Comparable<PacoteViagem> {

    private String descricao;
    private double precoPorPessoa;

    public PacoteViagem(String descricao, double precoPorPessoa) {
        setDescricao(descricao);
        setPrecoPorPessoa(precoPorPessoa);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição deve ser informada.");
        }
        this.descricao = descricao;
    }

    public double getPrecoPorPessoa() {
        return precoPorPessoa;
    }

    public void setPrecoPorPessoa(double precoPorPessoa) {
        if (precoPorPessoa < 0) {
            throw new IllegalArgumentException("O preço por pessoa não pode ser negativo.");
        }
        this.precoPorPessoa = precoPorPessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacoteViagem that = (PacoteViagem) o;
        return Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

    @Override
    public int compareTo(PacoteViagem o) {
        return getDescricao().compareTo(o.getDescricao());
    }

    @Override
    public String toString() {
        return "PacoteViagem{" +
            "descricao='" + descricao + '\'' +
            ", precoPorPessoa=" + precoPorPessoa +
            '}';
    }
}
