package com.especialistajava.boaspraticasecodigolimpo;

public class PrincipalCarrinhoCompra {

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
//        carrinho.adicionarItem("Água", 5, 4);

        Produto produto = new Produto();
        produto.nome = "Água";
        produto.precoUnitario = 5;
        produto.ativar();

        carrinho.adicionarItem(produto, 4);

        Endereco endereco = new Endereco();
        endereco.logradouro = "Rua das Amoras";
        endereco.numero = "1000";
        endereco.bairro = "Centro";

        carrinho.gerarPedido(null);

        System.out.println("Pedido gerado");
    }
}