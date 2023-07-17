package com.especialistajava.generics.estoque;

import com.especialistajava.generics.estoque.model.Carro;
import com.especialistajava.generics.estoque.model.Roupa;
import com.especialistajava.generics.estoque.servico.GerenciadorEstoque;

public class Principal {

    public static void main(String[] args) {
        GerenciadorEstoque<Roupa> estoqueRoupas = new GerenciadorEstoque<>();
//        estoqueRoupas.adicionar(new Carro("BMW X1", 4));
        estoqueRoupas.adicionar(new Roupa("Camiseta básica branca", 20));
        estoqueRoupas.adicionar(new Roupa("Camiseta básica preta", 10));
        imprimirEstoque(estoqueRoupas);

        GerenciadorEstoque estoqueCarros = new GerenciadorEstoque();
        estoqueCarros.adicionar(new Carro("BMW X1", 4));
        estoqueCarros.adicionar(new Carro("Honda HR-V", 8));
        imprimirEstoque(estoqueCarros);
    }

    private static void imprimirEstoque(GerenciadorEstoque gerenciadorEstoque) {
        System.out.println("Estoque: " + gerenciadorEstoque.getQuantidadeTotal());
    }
}
