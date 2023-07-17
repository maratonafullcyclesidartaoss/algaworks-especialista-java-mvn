package com.especialistajava.streams.estoque;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        for (Produto produto : produtos) {
//            produto.ativar();
//            System.out.println();
//        }

//        Stream<Produto> stream = produtos.stream();
//        Consumer<Produto> consumerAtivar = Produto::ativar;
//        Consumer<Produto> consumerImprimir = System.out::println;
//        stream.forEach(consumerAtivar.andThen(consumerImprimir));

        produtos.stream()
            .forEach(produto -> {
                produto.ativar();
                System.out.println(produto);
            });
    }
}
