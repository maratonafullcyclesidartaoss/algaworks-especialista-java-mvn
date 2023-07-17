package com.especialistajava.streams.estoque;

import com.especialistajava.estruturascontroleoperadores.EstruturaRepeticaoFor;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal25 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // coletar elementos do stream em um mapa com valores agregados
        // mapa, onde chave é o nome do fabricante dos produtos e o valor é a quantidade de itens
        // de cadastro de produtos que cada fabricante tem
        // total de produtos cadastrados para um fabricante
        Map<String, Long> produtosPorFabricante = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
                Collectors.counting()));

        System.out.println("produtosPorFabricante: " + produtosPorFabricante);

        // quantas unidades no estoque de qualquer produto que nós temos de um determinado fabricante
        // quantos itens no estoque têm para os produtos desse fabricante?
        Map<String, Integer> unidadesNoEstoquePorFabricante = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
                Collectors.summingInt(Produto::getQuantidade)));

        System.out.println("unidadesNoEstoquePorFabricante: " + unidadesNoEstoquePorFabricante);

    }
}
