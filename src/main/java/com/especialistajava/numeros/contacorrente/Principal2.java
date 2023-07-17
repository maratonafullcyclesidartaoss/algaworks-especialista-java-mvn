package com.especialistajava.numeros.contacorrente;

public class Principal2 {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.depositar(1);

        conta.sacar(0.1);
        conta.sacar(0.2);
        conta.sacar(0.3);
        conta.sacar(0.4);

        System.out.println(conta.getSaldo());

    }
}
