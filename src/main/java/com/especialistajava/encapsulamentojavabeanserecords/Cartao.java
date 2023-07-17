package com.especialistajava.encapsulamentojavabeanserecords;

public class Cartao {

    public static final double TARIFA_DEPOSITO = 0.1;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;

    public Cartao(String titular) {
        this.titular = titular;
    }

    public String obterTitutlar() {
        return titular;
    }

    public double obterSaldo() {
        return saldo;
    }

    public void debitar(double valorDebito) {
        if (valorDebito < 0) {
            throw new RuntimeException("Não pode debitar valor negativo");
        }
        if (obterSaldo() < valorDebito) {
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }
        this.saldo -= valorDebito;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < 0) {
            throw new RuntimeException("Não pode depositar valor negativo");
        }
        if (valorDeposito < VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                String.format("Valor de depósito não pode ser menor que %.2f", VALOR_MINIMO_DEPOSITO));
        }
        this.saldo += valorDeposito - TARIFA_DEPOSITO;
    }
}