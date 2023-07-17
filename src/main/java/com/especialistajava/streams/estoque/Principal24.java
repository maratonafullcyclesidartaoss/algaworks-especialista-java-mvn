package com.especialistajava.streams.estoque;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal24 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // agrupar produtos por fabricante
        // para cada fabricante, uma lista de produtos
        // agrupar em um mapa
        Map<Fabricante, List<Produto>> produtosPorFabricante = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(Collectors.groupingBy(Produto::getFabricante));

//        System.out.println(produtosPorFabricante.get(new Fabricante("Di Prima")));
//        System.out.println(produtosPorFabricante.get(new Fabricante("Coca-cola")));

        produtosPorFabricante.forEach((fabricante, produtosDoFabricante) -> {
            System.out.println();
            System.out.println(fabricante.nome());
            System.out.println("---------------");
            produtosDoFabricante.forEach(produto -> System.out.println(produto.getNome()));
        });

    }
}
