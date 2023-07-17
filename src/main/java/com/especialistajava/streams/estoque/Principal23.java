package com.especialistajava.streams.estoque;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal23 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // coletar os produtos em um mapa onde a chave é o nome do produto e o valor da
        // entrada é a quantidade de estoque desse produto
        Map<String, Integer> estoque = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(Collectors.toMap(Produto::getNome,
                Produto::getQuantidade));

        System.out.println(estoque);


    }
}
