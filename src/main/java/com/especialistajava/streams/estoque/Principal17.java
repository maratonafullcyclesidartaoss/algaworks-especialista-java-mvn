package com.especialistajava.streams.estoque;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Principal17 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
//        List<Produto> produtos = cadastroProduto.obterTodos();
        List<Produto> produtos = new ArrayList<>();

        // verificar qual é o máximo das quantidades dos produtos que têm no estoque
//        int maiorQuantidade = produtos.stream()
//            .mapToInt(Produto::getQuantidade)
//            .reduce(0, Integer::max);

        // não deseja retornar diretamente o zero quando não há quantidades de produtos no estoque.
        // OptionalInt pode ter um valor ou não.
        OptionalInt maiorQuantidadeOptional = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                    .reduce(Integer::max);

        int maiorQuantidade = maiorQuantidadeOptional
            .orElseThrow(() -> new RuntimeException("Quantidade não encontrada."));

        System.out.println(maiorQuantidade);
    }
}
