package com.especialistajava.interfaces.seguradora.modelo;

public class ImovelResidencial implements BemSeguravel {

    public static final double PORCENTAGEM_VALOR_MERCADO = 0.001;
    public static final double VALOR_POR_METRO_QUADRADO_DE_AREA_CONSTRUIDA = 0.3;

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        if (valorMercado <= 0) {
            throw new IllegalArgumentException("Informe o valor de mercado.");
        }
        if (areaConstruida <= 0) {
            throw new IllegalArgumentException("Informe a área construída.");
        }
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return calcularPorcentagemDoValorMercado() + calcularValorTotalAreaConstruida();
    }

    private double calcularPorcentagemDoValorMercado() {
        return getValorMercado() * PORCENTAGEM_VALOR_MERCADO;
    }

    private double calcularValorTotalAreaConstruida() {
        return getAreaConstruida() * VALOR_POR_METRO_QUADRADO_DE_AREA_CONSTRUIDA;
    }

    @Override
    public String descrever() {
        return String.format("Imóvel residencial com %dm2 de área construída, avaliado em R$ %.2f",
            getAreaConstruida(), getValorMercado());
    }
}
