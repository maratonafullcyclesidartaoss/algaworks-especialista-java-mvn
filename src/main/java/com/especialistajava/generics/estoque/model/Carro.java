package com.especialistajava.generics.estoque.model;

public class Carro implements Estocavel {

    private String modelo;
    private int quantidadeEstoque;

    public Carro(String modelo, int quantidadeEstoque) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo deve ser informado.");
        }
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque informada não pode ser negativa.");
        }
        this.modelo = modelo;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
