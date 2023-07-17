package com.especialistajava.interfaces.seguradora.modelo;

public class Caminhao extends VeiculoAutomotor {

    public static final double VALOR_PADRAO_POR_EIXO = 50;
    public static final double PORCENTAGEM_VALOR_MERCADO = 0.02;

    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        if (quantidadeEixos <= 0) {
            throw new IllegalArgumentException("Informe a auantidade de eixos.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        return calcularPorcentagemSobreValorMercado() + calcularValorTotalEixos();
    }

    private double calcularPorcentagemSobreValorMercado() {
        return getValorMercado() * PORCENTAGEM_VALOR_MERCADO;
    }

    private double calcularValorTotalEixos() {
        return getQuantidadeEixos() * VALOR_PADRAO_POR_EIXO;
    }

    @Override
    public String descrever() {
        return String.format("Caminhão %s ano %d, %d eixos, avaliado em R$ %.2f",
            getModelo(), getAnoFabricacao(), getQuantidadeEixos(), getValorMercado());
    }
}
