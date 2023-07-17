package com.especialistajava.streams.estoque;

import java.util.List;
import java.util.stream.Stream;

public class Principal8 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        boolean temProdutoNoEstoque = produtos.stream()
//            .peek(System.out::println)
//            .anyMatch(Produto::temEstoque);
//
//        System.out.println(temProdutoNoEstoque);

//        boolean todosProdutoPossuemEstoque = produtos.stream()
//            .peek(System.out::println)
//            .allMatch(Produto::temEstoque);
//
//        System.out.println(todosProdutoPossuemEstoque);

        boolean nenhumProdutoPossuiEstoque = produtos.stream()
            .peek(System.out::println)
            .noneMatch(Produto::temEstoque);

        System.out.println(nenhumProdutoPossuiEstoque);

    }
}
