package com.especialistajava.herancainterfacesboaspraticas.locadora.composicao.locadora.modelo;

public class Notebook {

    private String descricao;
    private double precoPorHora;
    private double precoPorDia;

    public Notebook(String descricao, double precoPorHora, double precoPorDia) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe a descrição.");
        }
        if (precoPorHora <= 0) {
            throw new IllegalArgumentException("Informe o preço por hora.");
        }
        if (precoPorHora <= 0) {
            throw new IllegalArgumentException("Informe o preço por dia.");
        }
        this.descricao = descricao;
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }
}
