package com.especialistajava.streams.estoque;

import java.util.List;

public class Principal12 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
            .filter(Produto::temEstoque)
            .map(Produto::getFabricante)
            .distinct()
            .forEach(System.out::println);

    }
}
