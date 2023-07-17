package com.especialistajava.classesaninhadas.anonimas;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Principal {

    private static final NumberFormat FORMATADOR_MOEDA =
        new DecimalFormat("¤ #,##0.00");

    public static void main(String[] args) {
        Conta conta = new Conta(new BigDecimal("1000"));
        System.out.printf("Saldo inicial: %s%n",
            FORMATADOR_MOEDA.format(conta.getSaldo()));

        Transacao transacao1 = conta.efetuarPagamento(new BigDecimal("100"));
        Transacao transacao2 = conta.cobrarTarifa(new BigDecimal("20"));

        System.out.printf("Transação 1: %s%n",
            FORMATADOR_MOEDA.format(transacao1.getValorTotal()));
        System.out.printf("Transação 2: %s%n",
            FORMATADOR_MOEDA.format(transacao2.getValorTotal()));

        System.out.printf("Saldo final: %s%n",
            FORMATADOR_MOEDA.format(conta.getSaldo()));

        transacao1.reembolsar();
        System.out.printf("Saldo após reembolso: %s%n",
            FORMATADOR_MOEDA.format(conta.getSaldo()));
    }
}
