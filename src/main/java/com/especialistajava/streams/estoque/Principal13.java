package com.especialistajava.streams.estoque;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Principal13 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // obter todas as categorias de produtos que possuem estoque
//        Stream<Stream<Categoria>> stream = produtos.stream()
//            .filter(Produto::temEstoque)
//            .map(produto -> produto.getCategorias().stream());
//        Stream<Categoria> stream = produtos.stream()
//            .filter(Produto::temEstoque)
//            .flatMap(produto -> produto.getCategorias().stream())
//            .distinct();

//        stream.forEach(categorias -> System.out.println(categorias.getClass().getName() + " - " + categorias.toString()));
//        stream.forEach(categorias -> {
//            categorias.stream().forEach(System.out::println);
//        });
//        stream.forEach(categoria -> System.out.println(categoria.getClass().getName() + " - " + categoria));

//        produtos.stream()
//            .filter(Produto::temEstoque)
//            .flatMap(produto -> produto.getCategorias().stream())
//            .distinct()
//            .forEach(categoria -> System.out.println(categoria.getClass().getName() + " - " + categoria));

        produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            .forEach(System.out::println);
    }
}
