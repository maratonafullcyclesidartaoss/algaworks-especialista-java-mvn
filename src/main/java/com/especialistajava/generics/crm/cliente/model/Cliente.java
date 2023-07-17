package com.especialistajava.generics.crm.cliente.model;

public class Cliente {

    private String razaoSocial;
    private double faturamentoMensal;

    public Cliente(String razaoSocial, double faturamentoMensal) {
        if (razaoSocial == null || razaoSocial.trim().isEmpty()) {
            throw new IllegalArgumentException("Deve ser informado a razão social.");
        }
        if (faturamentoMensal <= 0) {
            throw new IllegalArgumentException("Faturamento mensal não deve ser negativo ou zero.");
        }
        this.razaoSocial = razaoSocial;
        this.faturamentoMensal = faturamentoMensal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getFaturamentoMensal() {
        return faturamentoMensal;
    }

    public void setFaturamentoMensal(double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }
}
