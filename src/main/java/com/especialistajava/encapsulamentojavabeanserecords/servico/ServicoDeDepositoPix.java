package com.especialistajava.encapsulamentojavabeanserecords.servico;

import com.especialistajava.encapsulamentojavabeanserecords.Cartao;
import com.especialistajava.encapsulamentojavabeanserecords.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
//        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
//            throw new IllegalArgumentException(
//                String.format("Valor de depósito não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
//        }

//        double saldoAposDeposito = this.calcularSaldoAposDeposito(cartao, valorDeposito);
//        cartao.alterarSaldo(saldoAposDeposito);

        cartao.depositar(valorDeposito);
        return new Recibo(cartao.obterTitutlar(), "Depósito", valorDeposito);
    }

//    private double calcularSaldoAposDeposito(Cartao cartao, double valorDeposito) {
//        return (cartao.obterSaldo() + valorDeposito) - Cartao.TARIFA_DEPOSITO;
//    }
}