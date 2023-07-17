package com.especialistajava.herancainterfacesboaspraticas.banco;

import com.especialistajava.herancainterfacesboaspraticas.banco.modelo.Conta;
import com.especialistajava.herancainterfacesboaspraticas.banco.modelo.ContaCorrente;

public class ContaCorrenteComTributacao extends ContaCorrente {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        super.transferir(contaDestino, valor);
        super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        super.aplicarEmInvestimento(valor);
        this.sacarTarifa(valor);
    }

    public void sacarTarifa(double valorMovimentacao) {
        super.sacar(valorMovimentacao * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}
