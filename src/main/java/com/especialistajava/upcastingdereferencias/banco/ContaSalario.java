package com.especialistajava.upcastingdereferencias.banco;

public class ContaSalario extends ContaNormal {

    private double salarioMensal;

    public ContaSalario(Titular titular, int agencia, int numero, double salarioMensal) {
        super(titular, agencia, numero);
        if (salarioMensal <= 0) {
            throw new IllegalArgumentException("Informe o salário mensal.");
        }
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
