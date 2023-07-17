package com.especialistajava.streams.estoque;

import java.util.List;

public class Principal4 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
            .peek(produto -> produto.setNome(produto.getNome().toUpperCase()))
            .peek(System.out::println)
            .filter(Produto::temEstoque)
            .filter(Produto::isInativo)
            .forEach(produto -> {
                System.out.println("Ativando " + produto);
                produto.ativar();
            });
    }
}
