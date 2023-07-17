package com.especialistajava.heranca;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public Holerite(String nome, String mesAno, double valorSalario) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        if (mesAno == null || mesAno.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o Mês/Ano");
        }
        if (valorSalario <= 0) {
            throw new IllegalArgumentException("Informe o salário.");
        }
        this.nome = nome;
        this.mesAno = mesAno;
        this.valorSalario = valorSalario;
    }

    public void imprimir() {
        System.out.printf("Seu holerite: Nome: %s, Mês/Ano: %s, Salário: R$ %.2f%n",
            nome, mesAno, valorSalario);
    }
}
