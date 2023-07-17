package com.especialistajava.herancainterfacesboaspraticas.locadora.composicao.locadora.modelo;

public class PrecificacaoPorDia implements Precificacao {

    public static final double TOTAL_HORAS_DIA = 24d;

    @Override
    public double calcularValorTotal(Notebook notebook, int horasUtilizadas) {
        double dias = Math.ceil(horasUtilizadas / TOTAL_HORAS_DIA);
        return notebook.getPrecoPorDia() * dias;
    }
}
