package com.especialistajava.collections.comercial;

import java.util.Objects;

public class ItemVenda {

    private final String descricao;
    private final double valor;

    public ItemVenda(String descricao, double valor) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição do item de venda deve ser informada.");
        }
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do item de venda não deve ser negativo.");
        }
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemVenda itemVenda = (ItemVenda) o;
        return Objects.equals(descricao, itemVenda.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
            "descricao='" + descricao + '\'' +
            ", valor=" + valor +
            '}';
    }
}
