package com.especialistajava.streams.estoque;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Principal16 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // reduzir stream de produtos para um BigDecimal
        // qual é o valor ($) do estoque total que nós temos?
        // custo unitário multiplicado pela quantidade de cada produto = valor total
//        BigDecimal valorEmEstoque = produtos.stream()
//            .map(produto -> produto.getPreco().multiply(new BigDecimal(produto.getQuantidade())))
//            .reduce(BigDecimal.ZERO, BigDecimal::add);

        // $ 3,100

//        BigDecimal valorEmEstoque = produtos.stream()
//            .map(Produto::getValorEstoque)
//            .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal valorEmEstoque = produtos.stream()
                .reduce(BigDecimal.ZERO, (subtotal, produto) -> {
                    BigDecimal valorEstoqueProduto = produto.getPreco().multiply(
                        new BigDecimal(produto.getQuantidade()));
                    return subtotal.add(valorEstoqueProduto);
                }, BigDecimal::add);

        System.out.println(valorEmEstoque);


    }
}
