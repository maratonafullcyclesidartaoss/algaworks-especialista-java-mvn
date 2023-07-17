package com.especialistajava.streams.estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Principal29 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        List<Fabricante> fabricantes = new ArrayList<>();

        // evitar alterar alguma variável externa dentro do pipeline
        // se estiver gerando efeito colateral para o estado da aplicação,
        // ou seja, está alterando alguma variável externa ao pipeline,
        // está ferindo o paradigma da programação funcional
        // conforme o paradigma funcional, o pipeline deveria trabalhar apenas com
        // funções puras, que dependem apenas de uma entrada, que pode ser
        // o resultado da operação anterior,
        // não dependem de valores externos ou de variáveis externas.
        produtos.stream()
            .filter(Produto::temEstoque)
            .forEach(produto -> {
                if (!fabricantes.contains(produto.getFabricante())) {
                    fabricantes.add(produto.getFabricante());
                }
            });

        System.out.println(fabricantes);

        List<Fabricante> novaListaDeFabricantes = produtos.stream()
            .filter(Produto::temEstoque)
            .map(Produto::getFabricante)
            .distinct()
            .toList();

        System.out.println(novaListaDeFabricantes);
    }
}
