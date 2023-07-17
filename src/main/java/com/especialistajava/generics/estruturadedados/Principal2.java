package com.especialistajava.generics.estruturadedados;

import com.especialistajava.generics.estruturadedados.loja.Produto;

public class Principal2 {

    public static void main(String[] args) {
//        Colecao<Produto> produtos = new Fila<>();
        Colecao<Produto> produtos = new Pilha<>();
        produtos.colocar(new Produto("Arroz"));
        produtos.colocar(new Produto("Feijão"));
        produtos.colocar(new Produto("Água de Côco"));

        retirarTodos(produtos);

        Colecao<Object> nomes = new Pilha<>();
        nomes.colocar("João");
        nomes.colocar("Maria");

        retirarTodos(nomes);
    }

//    private static void retirarTodos(Colecao<Produto> produtos) {
//        try {
//            int i = 1;
//            while (true) {
//                Produto produto = produtos.retirar();
//                System.out.printf("%d. %s%n", i, produto.getDescricao());
//                i++;
//            }
//        } catch (ColecaoVaziaException e) {
//            System.out.println("Coleção de produtos esgotada.");
//        }
//    }

    private static void retirarTodos(Colecao<?> objetos) {
        try {
            int i = 1;
            while (true) {
                Object produto = objetos.retirar();
                System.out.printf("%d. %s%n", i, produto);
                i++;
            }
        } catch (ColecaoVaziaException e) {
            System.out.println("Coleção de produtos esgotada.");
        }
    }
}
