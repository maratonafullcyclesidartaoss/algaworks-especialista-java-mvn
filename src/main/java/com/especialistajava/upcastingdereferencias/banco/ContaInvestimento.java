package com.especialistajava.upcastingdereferencias.banco;

public class ContaInvestimento extends ContaNormal {

    private double valorTotalRendimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos += valorRendimentos;
        this.depositar(valorRendimentos);
    }

    @Override
    public boolean possuiGratuidadeImpressao() {
        return valorTotalRendimentos > 0;
    }

    @Override
    public String toString() {
        return "ContaInvestimentoHeranca{" +
            "valorTotalRendimentos=" + valorTotalRendimentos +
            '}';
    }
}