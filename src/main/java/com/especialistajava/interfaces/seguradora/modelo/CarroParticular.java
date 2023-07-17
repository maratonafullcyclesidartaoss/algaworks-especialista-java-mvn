package com.especialistajava.interfaces.seguradora.modelo;

public class CarroParticular extends VeiculoAutomotor {

    public static final double PORCENTAGEM_VALOR_MERCADO = 0.04;
    public static final int ANO_PADRAO = 2000;
    public static final double PORCENTAGEM_ACRESCIMO_SOBRE_PREMIO_CALCULADO = 1.05;

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = calcularPorcentagemSobreValorMercado();
        if (getAnoFabricacao() < ANO_PADRAO) {
            valorPremio *= PORCENTAGEM_ACRESCIMO_SOBRE_PREMIO_CALCULADO;
        }
        return  valorPremio;
    }

    private double calcularPorcentagemSobreValorMercado() {
        return getValorMercado() * PORCENTAGEM_VALOR_MERCADO;
    }

    @Override
    public String descrever() {
        return String.format("Carro particular %s ano %d, avaliado em R$ %.2f",
            getModelo(), getAnoFabricacao(), getValorMercado());
    }
}
