package com.especialistajava.boaspraticasecodigolimpo;

import java.util.Objects;

public class CarrinhoDeCompra {

    public static final double TAXA_SERVICO_PADRAO = 0.1;

    int quantidadeItens;
    Produto produto;

    void realizarCompra(String numeroCartao) {
        double valorTotal = this.calcularValorTotal();

        boolean pagamentoAutorizado = GatewayPagamento
                .autorizarPagamento(numeroCartao, valorTotal);

        if (pagamentoAutorizado) {
            this.imprimirReciboPagamento(valorTotal);
        }
    }



    private void imprimirReciboPagamento(double valorTotal) {
        System.out.println("RECIBO DE PAGAMENTO");
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);
    }

    private double calcularValorTotal() {
        double subtotal = this.calcularSubtotal();
        double taxaServico = this.calcularTaxaServico(subtotal);
        return subtotal + taxaServico;
    }

    private double calcularSubtotal() {
        return this.produto.precoUnitario * this.quantidadeItens;
    }

    private double calcularTaxaServico(double subtotal) {
        return subtotal * TAXA_SERVICO_PADRAO;
    }

    public void adicionarItem(String nomeProduto, double precoUnitario, int quantidade) {
    }

    void adicionarItem(Produto produto, int quantidade) {
        Objects.requireNonNull(produto, "Produto deve ser informado.");
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior do que zero.");
        }
        System.out.printf("Produto: %s%n", produto.nome);
    }

    public void gerarPedido(Endereco enderecoEntrega) {
        Objects.requireNonNull(enderecoEntrega, "Endereço de entrega deve ser informado");
    }

    public void gerarPedido() {

    }
}