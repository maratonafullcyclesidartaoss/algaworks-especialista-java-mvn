package com.especialistajava.interfaces.financeira.modelo;

public abstract class Empresa {

    private String razaoSocial;
    private double totalFaturamento;

    public Empresa(String razaoSocial, double totalFaturamento) {
        if (razaoSocial == null || razaoSocial.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe a razão social.");
        }
        if (totalFaturamento <= 0) {
            throw new IllegalArgumentException("Informe o total de faturamento.");
        }
        this.razaoSocial = razaoSocial;
        this.totalFaturamento = totalFaturamento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }

    public void setTotalFaturamento(double totalFaturamento) {
        this.totalFaturamento = totalFaturamento;
    }
}
