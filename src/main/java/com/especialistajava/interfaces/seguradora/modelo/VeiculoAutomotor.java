package com.especialistajava.interfaces.seguradora.modelo;

public abstract class VeiculoAutomotor implements BemSeguravel {

    private String modelo;
    private double valorMercado;
    private int anoFabricacao;

    public VeiculoAutomotor(String modelo, double valorMercado, int anoFabricacao) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o modelo.");
        }
        if (valorMercado <= 0) {
            throw new IllegalArgumentException("Informe o valor de mercado.");
        }
        if (anoFabricacao <= 0) {
            throw new IllegalArgumentException("Informe o ano de fabricação.");
        }
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
