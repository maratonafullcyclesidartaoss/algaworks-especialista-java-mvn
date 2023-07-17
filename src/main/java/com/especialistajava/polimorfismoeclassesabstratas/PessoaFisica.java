package com.especialistajava.polimorfismoeclassesabstratas;

public class PessoaFisica extends Pessoa {

    public static final double RECEITA_ANUAL_ISENCAO = 50_000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.2;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        if (receitaAnual <= 0) {
            throw new IllegalArgumentException("Informe a receita anual.");
        }
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        if (isIsento()) {
            return 0;
        }
        return this.receitaAnual * ALIQUOTA_IMPOSTO_RENDA;
    }

    private boolean isIsento() {
        return this.receitaAnual <= RECEITA_ANUAL_ISENCAO;
    }
}
