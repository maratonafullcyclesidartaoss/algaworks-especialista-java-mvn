package com.especialistajava.streams.estoque;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal20 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // coletar, acumular elementos do stream em um container: uma coleção, lista, conjunto
        // quais são as categorias dos produtos em estoque?
//        produtos.stream()
//            .filter(Produto::temEstoque)
//            .flatMap(produto -> produto.getCategorias().stream())
//            .distinct()
//            .forEach(System.out::println);

//        List<Categoria> categorias = produtos.stream()
//            .filter(Produto::temEstoque)
//            .flatMap(produto -> produto.getCategorias().stream())
//            .distinct()
//            .collect(() -> new ArrayList<>(),
//                (lista, elemento) -> lista.add(elemento),
//                (lista1, lista2) -> lista1.addAll(lista2));

        List<Categoria> categorias = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println(categorias);
    }
}
