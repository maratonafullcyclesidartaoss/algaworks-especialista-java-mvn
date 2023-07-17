package com.especialistajava.mergulhandoorientacaoobjetos;

public class PrincipalProduto2 {

    public static void main(String[] args) {
        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();
        produto.alterarPrecoCusto(100);

        System.out.printf("Total de custos: R$ %.2f%n", Produto.calcularCustosTotais(produto));
    }
}