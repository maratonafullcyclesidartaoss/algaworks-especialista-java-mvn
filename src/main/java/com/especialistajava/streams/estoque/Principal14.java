package com.especialistajava.streams.estoque;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal14 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // stream das quantidades que esses produtos têm no estoque; um stream de inteiros
        // sem fazer boxing/unboxing - trabalhar diretamente com tipos primitivos
        Stream<Integer> stream = produtos.stream()
            .filter(Produto::temEstoque)
            .map(Produto::getQuantidade);

        IntStream intStream = produtos.stream()
            .filter(Produto::temEstoque)
            .mapToInt(Produto::getQuantidade)
            .sorted();

        intStream.forEach(System.out::println);


    }
}
