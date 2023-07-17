package com.especialistajava.generics.sorteio;

public class Cliente {

    private String razaoSocial;
    private double faturamentoMensal;

    public Cliente(String razaoSocial, double faturamentoMensal) {
        if (razaoSocial == null || razaoSocial.trim().isEmpty()) {
            throw new IllegalArgumentException("Deve ser informado a razão social.");
        }
        this.razaoSocial = razaoSocial;
        this.faturamentoMensal = faturamentoMensal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public double getFaturamentoMensal() {
        return faturamentoMensal;
    }
}
