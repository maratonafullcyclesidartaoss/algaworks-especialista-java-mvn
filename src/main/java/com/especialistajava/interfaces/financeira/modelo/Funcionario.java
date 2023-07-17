package com.especialistajava.interfaces.financeira.modelo;

public class Funcionario implements PessoaBonificavel {

    public static final int QUANTIDADE_SALARIOS_LIMITE_CREDITO = 5;
    private String nome;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        if (salarioMensal <= 0) {
            throw new IllegalArgumentException("Informe o salário mensal.");
        }
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_SALARIOS_LIMITE_CREDITO;
    }

    @Override
    public double calcularBonus(double percentualMetaAlcancada) {
        return getSalarioMensal() * (percentualMetaAlcancada / 100);
    }
}
