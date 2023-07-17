package com.especialistajava.polimorfismoeclassesabstratas;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa) {
        double impostosPessoa = pessoa.calcularImpostos();
        this.valorTotalImpostos += impostosPessoa;
        System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), impostosPessoa);
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
