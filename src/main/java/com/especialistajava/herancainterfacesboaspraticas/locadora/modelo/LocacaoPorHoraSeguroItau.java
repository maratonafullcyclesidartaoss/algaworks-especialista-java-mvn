package com.especialistajava.herancainterfacesboaspraticas.locadora.modelo;

public class LocacaoPorHoraSeguroItau extends LocacaoPorHora {

    public static final double TOTAL_HORAS_DIA = 24d;
    public static final double CUSTO_POR_DIA = 5;

    public LocacaoPorHoraSeguroItau(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double valorDevido = super.calcularValorDevido(horasUtilizadas);

        double dias = Math.ceil(horasUtilizadas / TOTAL_HORAS_DIA);
        valorDevido += dias * CUSTO_POR_DIA;

        return valorDevido;
    }
}
