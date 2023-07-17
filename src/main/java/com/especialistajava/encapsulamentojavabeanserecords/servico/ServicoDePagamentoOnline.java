package com.especialistajava.encapsulamentojavabeanserecords.servico;

import com.especialistajava.encapsulamentojavabeanserecords.Cartao;
import com.especialistajava.encapsulamentojavabeanserecords.Estabelecimento;
import com.especialistajava.encapsulamentojavabeanserecords.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
//        if (cartao.obterSaldo() < valor) {
//            throw new RuntimeException("Saldo insuficiente para pagamento");
//        }

//        double saldoAposPagamento = this.calcularSaldoAposPagamento(cartao, valor);
//        cartao.alterarSaldo(saldoAposPagamento);

        cartao.debitar(valor);
        return new Recibo(cartao.obterTitutlar(), "Pagamento", valor);
    }

    private double calcularSaldoAposPagamento(Cartao cartao, double valor) {
        return cartao.obterSaldo() - valor;
    }
}
