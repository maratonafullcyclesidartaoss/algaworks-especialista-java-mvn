package com.especialistajava.numeros.contacorrente.bigdecimal;

import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {
        BigDecimal valorTotal = new BigDecimal("2.05");
        BigDecimal valorPago = new BigDecimal("1.05");

        BigDecimal valorDevido = valorTotal.subtract(valorPago);

        System.out.println(valorDevido);
    }
}
