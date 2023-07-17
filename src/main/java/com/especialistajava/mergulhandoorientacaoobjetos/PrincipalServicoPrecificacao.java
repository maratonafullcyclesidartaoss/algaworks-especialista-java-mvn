package com.especialistajava.mergulhandoorientacaoobjetos;

public class PrincipalServicoPrecificacao {

    public static void main(String[] args) {
        Produto.custoEmbalagem = 10;

        Produto novoProduto = new Produto();
//        novoProduto.precoCusto = 100;
        novoProduto.alterarPrecoCusto(100);

//        double precoCompraFornecedor = 140;
        System.out.printf("Preço de venda: R$ %.2f%n", novoProduto.precoVenda);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
//        double precoVenda = servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de custo: R$ %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preço de venda: R$ %.2f%n", novoProduto.precoVenda);
    }
}