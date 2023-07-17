package com.especialistajava.heranca;

public class Programador extends Funcionario {

    private double valorBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    protected final double calcularSalario(int horasTrabalhadas) {
        double valorSalario = super.calcularSalario(horasTrabalhadas);
        return valorSalario + valorBonus;
    }

    @Override
    public String toString() {
        return "Programador{" +
            "valorBonus=" + valorBonus +
            "} " + super.toString();
    }
}
