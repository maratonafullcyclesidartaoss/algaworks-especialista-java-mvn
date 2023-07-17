package com.especialistajava.upcastingdereferencias;

public abstract class NotaFiscal {

    private String descricao;
    private double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe a descrição.");
        }
        if (valorTotal <= 0) {
            throw new IllegalArgumentException("Informe o valor total.");
        }
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public abstract double calcularImpostos();

    public void emitir() {
        System.out.printf("Emitindo nota fiscal para: %s%n", getDescricao());
        System.out.printf("Valor total: R$ %.2f%n", getValorTotal());
        System.out.printf("Valor impostos: R$ %.2f%n", calcularImpostos());
    }
}
