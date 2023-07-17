package com.especialistajava.streams.estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Principal18 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();
//        List<Produto> produtos = new ArrayList<>();

        // caso especial de redução
        // só para interfaces especiais de tipos primitivos: IntStream, LongStream DoubleStream,
        int totalEstoque = produtos.stream()
//            .map(Produto::getPreco)
            .mapToInt(Produto::getQuantidade)
            .sum();
//            .reduce(0, Integer::sum);

        System.out.println(totalEstoque);

        // qual é a quantidade média de cada produto no estoque?
        // cada produto tem x quantidade no estoque
        double mediaEstoque = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .average()
            .orElseThrow(() -> new RuntimeException("Não há produtos para calcular a média."));

        System.out.println(mediaEstoque);

        // contar quantos itens no cadastro de produtos que têm estoque
        long totalProdutosComEstoque = produtos.stream()
            .filter(Produto::temEstoque)
            .count();

        System.out.println(totalProdutosComEstoque);
    }
}
