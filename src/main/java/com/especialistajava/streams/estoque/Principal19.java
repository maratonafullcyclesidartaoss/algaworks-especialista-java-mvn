package com.especialistajava.streams.estoque;

import java.util.Comparator;
import java.util.List;

public class Principal19 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // min e max
        // disponível apenas nas interfaces especiais: IntStream, LongStream, DoubleStream
        // menor elemento e maior elemento dentro de um stream
        // qual é a menor quantidade no estoque em toda a lista de produtos
        int menorQuantidadeEmEstoque = produtos.stream()
            .filter(Produto::temEstoque)
            .mapToInt(Produto::getQuantidade)
            .min()
            .orElseThrow(() -> new RuntimeException("Menor quantidade não encontrada."));

        System.out.println(menorQuantidadeEmEstoque);

        // qual é a maior quantidade no estoque em toda a lista de produtos
        int maiorQuantidadeEmEstoque = produtos.stream()
            .filter(Produto::temEstoque)
            .mapToInt(Produto::getQuantidade)
            .max()
            .orElseThrow(() -> new RuntimeException("Maior quantidade não encontrada."));

        System.out.println(maiorQuantidadeEmEstoque);

        // qual é o produto mais barato que tem no estoque?
        Produto produtoMaisBarato = produtos.stream()
            .filter(Produto::temEstoque)
            .min(Comparator.comparing(Produto::getPreco))
            .orElseThrow(() -> new RuntimeException("Produto mais barato não encontrado."));

        System.out.println(produtoMaisBarato);

        // qual é o produto mais caro que tem no estoque?
        Produto produtoMaisCaro = produtos.stream()
            .filter(Produto::temEstoque)
            .max(Comparator.comparing(Produto::getPreco))
            .orElseThrow(() -> new RuntimeException("Produto mais caro não encontrado."));

        System.out.println(produtoMaisCaro);
    }
}
