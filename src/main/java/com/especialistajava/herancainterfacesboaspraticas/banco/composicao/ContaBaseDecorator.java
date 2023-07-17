package com.especialistajava.herancainterfacesboaspraticas.banco.composicao;

import com.especialistajava.herancainterfacesboaspraticas.banco.modelo.Conta;

import java.util.Objects;

public abstract class ContaBaseDecorator implements Conta {

    private Conta contaOriginal;

    public ContaBaseDecorator(Conta contaOriginal) {
        Objects.requireNonNull(contaOriginal);
        this.contaOriginal = contaOriginal;
    }

    @Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    public Conta getContaOriginal() {
        return contaOriginal;
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
    }

    @Override
    public void transferir(Conta destino, double valor) {
        contaOriginal.transferir(destino, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        contaOriginal.aplicarEmInvestimento(valor);
    }
}
