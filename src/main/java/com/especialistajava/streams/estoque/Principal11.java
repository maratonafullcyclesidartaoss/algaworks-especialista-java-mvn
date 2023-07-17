package com.especialistajava.streams.estoque;

import java.util.Comparator;
import java.util.List;

public class Principal11 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        for (Produto produto : produtos) {
//            if (produto.temEstoque()) {
//                Fabricante fabricante = produto.getFabricante();
//                System.out.println(fabricante);
//            }
//        }

        produtos.stream()
            .filter(Produto::temEstoque)
            .map(Produto::getFabricante)
            .forEach(System.out::println);

    }
}
