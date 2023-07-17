package com.especialistajava.heranca;

public class Funcionario {

    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        if (valorHora <= 0) {
            throw new IllegalArgumentException("Informe o valor hora.");
        }
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
        double valorSalario = this.calcularSalario(horasTrabalhadas);
        return new Holerite(this.nome, mesAno, valorSalario);
    }

    protected double calcularSalario(int horasTrabalhadas) {
        return valorHora * horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
            "nome='" + nome + '\'' +
            ", valorHora=" + valorHora +
            '}';
    }
}
