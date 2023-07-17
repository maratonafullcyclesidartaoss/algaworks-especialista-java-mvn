package com.especialistajava.herancainterfacesboaspraticas.banco.modelo;

public class ContaCorrente implements Conta {

    public static final int VALOR_TARIFA_TRANSFERENCIA = 15;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
//        this.saldo -= valor;
        this.sacar(valor);
//        this.sacarTarifa(VALOR_TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        this.saldo -= valor;
    }

    public void sacarTarifa(double valorTarifa) {
        this.saldo -= valorTarifa;
    }
}
