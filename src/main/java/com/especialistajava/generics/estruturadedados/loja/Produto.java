package com.especialistajava.generics.estruturadedados.loja;

public class Produto {

    private String descricao;

    public Produto(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição deve ser informada.");
        }
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
            "descricao='" + descricao + '\'' +
            '}';
    }
}
