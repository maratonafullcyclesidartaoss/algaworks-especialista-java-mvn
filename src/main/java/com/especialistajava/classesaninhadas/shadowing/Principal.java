package com.especialistajava.classesaninhadas.shadowing;

import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(
            BigDecimal.valueOf(1_000));

        System.out.println(contaCorrente.getSaldo());

        ContaCorrente.Transacao transacao1 = contaCorrente
            .new Transacao("Compra no mercado", new BigDecimal("180.9"));

        ContaCorrente.Transacao transacao2 = contaCorrente
            .new Transacao("Academia", new BigDecimal("170"));

        System.out.println(contaCorrente.getSaldo());

        for (ContaCorrente.Transacao transacao : contaCorrente.getTransacoes()) {
            System.out.printf("%s = %s%n", transacao.getDescricao(), transacao.getValor());
        }
    }
}
