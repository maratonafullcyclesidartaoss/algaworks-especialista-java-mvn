package com.especialistajava.streams.estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;

public class Principal21 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // coletores padrão do Java.
        // collector é a combinação dos 3 argumentos: supplier, accumulator, combiner:
        // collector já representa essas 3 coisas juntas
        // .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        // supplier: ArrayList::new
        // accumulator: ArrayList::add
        // combiner: ArrayList::addAll

        // não tem a garantia de qual é a implementação de lista retornada pelo Collector
        // ou se a lista é mutável ou imutável
//        List<Categoria> categorias = produtos.stream()
//            .filter(Produto::temEstoque)
//            .flatMap(produto -> produto.getCategorias().stream())
//            .distinct()
//            .collect(toList());

//        Set<Categoria> categorias = produtos.stream()
//            .filter(Produto::temEstoque)
//            .flatMap(produto -> produto.getCategorias().stream())
//            .collect(Collectors.toSet());

        // tem a garantia de qual é a implementação de lista retornada pelo Collector
        // tem a garantia de que é uma lista mutável e de que a implementação é um ArrayList
        List<Categoria> categorias = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            .collect(toCollection(ArrayList::new));

        System.out.println(categorias);
    }
}
