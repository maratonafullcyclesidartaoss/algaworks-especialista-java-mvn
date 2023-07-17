package com.especialistajava.herancainterfacesboaspraticas.banco.composicao;

import com.especialistajava.herancainterfacesboaspraticas.banco.modelo.Conta;

public class TributacaoDecorator extends ContaBaseDecorator {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    public TributacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    @Override
    public void sacar(double valor) {
        getContaOriginal().sacar(valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        getContaOriginal().transferir(contaDestino, valor);
        this.debitarImpostoMovimentacao(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        getContaOriginal().aplicarEmInvestimento(valor);
        this.debitarImpostoMovimentacao(valor);
    }

    private void debitarImpostoMovimentacao(double valorMovimentacao) {
        getContaOriginal().sacar(valorMovimentacao * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}
