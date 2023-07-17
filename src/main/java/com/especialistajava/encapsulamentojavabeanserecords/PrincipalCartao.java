package com.especialistajava.encapsulamentojavabeanserecords;

import com.especialistajava.encapsulamentojavabeanserecords.servico.ServicoDeDepositoPix;
import com.especialistajava.encapsulamentojavabeanserecords.servico.ServicoDePagamentoOnline;

public class PrincipalCartao {

    public static void main(String[] args) {

        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("Joao Souza Silva");

//        cartao.debitar(70);

        var servicoDeDeposito = new ServicoDeDepositoPix();
        Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servicoDePagamento.efetuarPagamento(supermercado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.obterTitutlar());
        System.out.printf("Saldo: R$ %.2f%n", cartao.obterSaldo());
    }
}