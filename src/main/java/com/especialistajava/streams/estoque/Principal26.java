package com.especialistajava.streams.estoque;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal26 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // uma forma de particionar os elementos do stream em 2 grupos:
        // onde de um lado vão ter os elementos TRUE (verdadeiros) e do outro lado
        // vão ter os elementos FALSE (falsos)
        // particionar os elementos para fazer alguma coisa com 2 grupos
        // usar partitioningBy
        // perde flexibilidade do groupingBy, porque chave vai ser sempre true/false

//        Map<String, List<Produto>> produtosPorFabricante = produtos.stream()
//            .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome()));
//
//        produtosPorFabricante.forEach((fabricante, produtosDoFabricante) -> {
//            System.out.println();
//            System.out.println(fabricante);
//            System.out.println("---------------");
//            produtosDoFabricante.forEach(System.out::println);
//        });

        Map<Boolean, List<Produto>> produtosTemEstoque = produtos.stream()
            .collect(Collectors.partitioningBy(Produto::temEstoque));

        produtosTemEstoque.forEach((temEstoque, produtosComSemEstoque) -> {
            System.out.println();
            System.out.println(temEstoque);
            System.out.println("---------------");
            produtosComSemEstoque.forEach(System.out::println);
        });
    }
}
