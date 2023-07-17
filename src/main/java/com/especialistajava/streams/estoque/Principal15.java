package com.especialistajava.streams.estoque;

import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal15 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // somatória de itens do estoque
        // 10 produtos - cada um tem uma quantidade específica no estoque
        // somar todos esses itens e ter um resultado final

        IntBinaryOperator operacaoSoma = (subtotal, valor) -> {
            System.out.println(subtotal + " + " + valor);
            return subtotal + valor;
        };

        // operações de redução
//        int totalEstoque = produtos.stream()
//            .mapToInt(Produto::getQuantidade)
//            .reduce(0, operacaoSoma);

//        int totalEstoque = produtos.stream()
//            .mapToInt(Produto::getQuantidade)
//            .reduce(0, (subtotal, valor) -> subtotal + valor);

//        int totalEstoque = produtos.stream()
//            .mapToInt(Produto::getQuantidade)
//            .reduce(0, (a, b) -> a + b);

        int totalEstoque = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(0, Integer::sum);

        System.out.println(totalEstoque);

        // qual que é a quantidade máxima que tem no estoque?
        int maximoEstoque = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(0, Integer::max);

        System.out.println(maximoEstoque);

        // qual que é a quantidade mínimo que tem no estoque?
        int minimoEstoque = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(0, Integer::min);

        System.out.println(minimoEstoque);
    }
}
