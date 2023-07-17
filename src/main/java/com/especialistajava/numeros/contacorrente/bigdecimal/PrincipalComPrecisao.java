package com.especialistajava.numeros.contacorrente.bigdecimal;

import java.math.BigDecimal;

public class PrincipalComPrecisao {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(new BigDecimal("1"));
        conta.sacar(new BigDecimal("0.10"));
        conta.sacar(new BigDecimal("0.20"));
        conta.sacar(new BigDecimal("0.30"));
        conta.sacar(BigDecimal.valueOf(0.40));
        System.out.println(conta.getSaldo());


    }
}
