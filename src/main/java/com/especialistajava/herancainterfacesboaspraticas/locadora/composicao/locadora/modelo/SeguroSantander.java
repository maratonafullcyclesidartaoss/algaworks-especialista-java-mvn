package com.especialistajava.herancainterfacesboaspraticas.locadora.composicao.locadora.modelo;

public class SeguroSantander implements Seguro {

    public static final double VALOR_UTILIZADO_POR_HORA = 0.5;
    public static final double PORCENTAGEM_VALOR_DO_CONTRATO = 0.05;

    @Override
    public double calcularPremio(int horasUtilizadas, double valorContrato) {
        return calcularValorTotalHorasUtilizadas(horasUtilizadas) +
            calcularPorcentagemDoValorContrato(valorContrato);
    }

    private double calcularPorcentagemDoValorContrato(double valorContrato) {
        return valorContrato * PORCENTAGEM_VALOR_DO_CONTRATO;
    }

    private double calcularValorTotalHorasUtilizadas(int horasUtilizadas) {
        return horasUtilizadas * VALOR_UTILIZADO_POR_HORA;
    }
}
