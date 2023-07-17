package com.especialistajava.streams.estoque;

import java.util.List;
import java.util.stream.Stream;

public class Principal3 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
            .filter(Produto::temEstoque)
            .filter(Produto::isInativo)
            .forEach(produto -> {
                System.out.println("Ativando " + produto);
                produto.ativar();
            });


//        Stream<Produto> stream = produtos.stream();
//
//        Stream<Produto> streamComEstoque = stream
//            .filter(Produto::temEstoque);
//
//        Stream<Produto> streamComEstoqueInativo = streamComEstoque
//            .filter(Produto::isInativo);
//
//        streamComEstoqueInativo.forEach(produto -> {
//                produto.ativar();
//                System.out.println(produto);
//            });
    }
}
