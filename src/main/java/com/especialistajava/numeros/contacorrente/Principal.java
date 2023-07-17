package com.especialistajava.numeros.contacorrente;

public class Principal {

    public static void main(String[] args) {
        double valorTotal = 2.05;
        double valorPago = 1.05;

        double valorDevido = valorTotal - valorPago;

        System.out.println(valorDevido);
    }
}
