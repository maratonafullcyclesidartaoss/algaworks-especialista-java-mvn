package com.especialistajava.polimorfismoeclassesabstratas;

public abstract class PessoaJuridica extends Pessoa {

    private double faturamentoAnual;
    private double despesaAnual;

    public PessoaJuridica(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome);
        if (faturamentoAnual <= 0) {
            throw new IllegalArgumentException("Informe o faturamento anual.");
        }
        if (despesaAnual <= 0) {
            throw new IllegalArgumentException("Informe a despesa anual.");
        }
        this.faturamentoAnual = faturamentoAnual;
        this.despesaAnual = despesaAnual;
    }

    public double getFaturamentoAnual() {
        return faturamentoAnual;
    }

    public double getDespesaAnual() {
        return despesaAnual;
    }

    public double getLucroAnual () {
        return this.getFaturamentoAnual() - this.getDespesaAnual();
    }
}
