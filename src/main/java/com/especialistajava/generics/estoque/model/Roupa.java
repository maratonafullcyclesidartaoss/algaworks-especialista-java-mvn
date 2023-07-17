package com.especialistajava.generics.estoque.model;

public class Roupa implements Estocavel {

    private String descricao;
    private int quantidadeEstoque;

    public Roupa(String descricao, int quantidadeEstoque) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição deve ser informada.");
        }
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque informada não pode ser negativa.");
        }
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
