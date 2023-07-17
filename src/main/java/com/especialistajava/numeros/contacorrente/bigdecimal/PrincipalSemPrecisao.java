package com.especialistajava.numeros.contacorrente.bigdecimal;

import java.math.BigDecimal;

public class PrincipalSemPrecisao {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(new BigDecimal(1));
        conta.sacar(new BigDecimal(0.10));
        conta.sacar(new BigDecimal(0.20));
        conta.sacar(new BigDecimal(0.30));
        conta.sacar(new BigDecimal(0.4));
        System.out.println(conta.getSaldo());
    }
}
