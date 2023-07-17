package com.especialistajava.lancandoexcecoes.banco;

public class SaldoInsuficienteException extends Exception {

    private final double saldoAtual;
    private final double valorSaque;

    public SaldoInsuficienteException(String message, double saldoAtual, double valorSaque) {
        super(message);
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("O valor do saque não pode ser negativo ou zero.");
        }
        this.saldoAtual = saldoAtual;
        this.valorSaque = valorSaque;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public double getValorSaque() {
        return valorSaque;
    }
}
