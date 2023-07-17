package com.especialistajava.herancainterfacesboaspraticas.locadora.composicao.locadora.modelo;

public class SeguroItau implements Seguro {

    public static final double TOTAL_HORAS_DIA = 24d;
    public static final double CUSTO_POR_DIA = 5;

    @Override
    public double calcularPremio(int horasUtilizadas, double valorContrato) {
        double dias = Math.ceil(horasUtilizadas / TOTAL_HORAS_DIA);
        return dias * CUSTO_POR_DIA;
    }
}
