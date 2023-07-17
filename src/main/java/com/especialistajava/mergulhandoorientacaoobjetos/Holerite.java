package com.especialistajava.mergulhandoorientacaoobjetos;

public class Holerite {

    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;
    Funcionario funcionario;

    double calcularValorTotal() {
        return this.valorTotalHorasNormais + this.valorTotalHorasExtras + valorAdicionalFilhos;
    }

    void imprimir() {
        System.out.printf("Funcionário: %s%n", this.funcionario.nome);
        System.out.printf("Possui filhos: %b%n", this.funcionario.possuiFilhos());
        System.out.printf("Valor total horas normais: R$ %6.2f%n", this.valorTotalHorasNormais);
        System.out.printf("Valor total horas extras: R$ %6.2f%n", this.valorTotalHorasExtras);
        if (this.funcionario.possuiFilhos()) {
            System.out.printf("Valor adicinal filhos: R$ %6.2f%n", this.valorAdicionalFilhos);
        }
        System.out.printf("Valor total: R$ %6.2f%n", this.calcularValorTotal());
    }
}