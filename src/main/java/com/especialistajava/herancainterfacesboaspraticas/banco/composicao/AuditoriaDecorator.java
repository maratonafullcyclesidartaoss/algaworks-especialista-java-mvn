package com.especialistajava.herancainterfacesboaspraticas.banco.composicao;

import com.especialistajava.herancainterfacesboaspraticas.banco.modelo.Conta;

public class AuditoriaDecorator extends ContaBaseDecorator {

    private int quantidadeOperacoes;

    public AuditoriaDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    public int getQuantidadeOperacoes() {
        return quantidadeOperacoes;
    }

    @Override
    public void sacar(double valor) {
        quantidadeOperacoes++;
        getContaOriginal().sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        quantidadeOperacoes++;
        getContaOriginal().depositar(valor);
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        quantidadeOperacoes++;
        getContaOriginal().transferir(contaDestino, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        quantidadeOperacoes++;
        getContaOriginal().aplicarEmInvestimento(valor);
    }
}
