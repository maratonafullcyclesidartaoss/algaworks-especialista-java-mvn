package com.especialistajava.generics.estoque.servico;

import com.especialistajava.generics.estoque.model.Estocavel;

public class GerenciadorEstoque<T extends Estocavel> {

    private int quantidadeTotal;

    public void adicionar(T estocavel) {
        quantidadeTotal += estocavel.getQuantidadeEstoque();
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }
}
