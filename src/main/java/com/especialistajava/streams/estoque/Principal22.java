package com.especialistajava.streams.estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toUnmodifiableList;

public class Principal22 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // elementos de um stream coletados em uma lista não modificável (imutáveis)
        // Collectors.toUnmodifiableList (Java 10)
//        List<Categoria> categorias = produtos.stream()
//            .filter(Produto::temEstoque)
//            .flatMap(produto -> produto.getCategorias().stream())
//            .distinct()
//            .collect(toUnmodifiableList());

//        categorias.remove(0);

        // usando um método de conveniência. retorna lista não-modificável
        // Java 16
        List<Categoria> categorias = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            .toList();

//        categorias.remove(0);

        System.out.println(categorias);
    }
}
