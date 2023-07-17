package com.especialistajava.heranca.banco;

public class ContaInvestimentoHeranca extends ContaNormal {

    private double valorTotalRendimentos;

    public ContaInvestimentoHeranca(Titular titular, int agencia, int numero) {
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
    public String toString() {
        return "ContaInvestimentoHeranca{" +
            "valorTotalRendimentos=" + valorTotalRendimentos +
            '}';
    }
}