package com.especialistajava.herancainterfacesboaspraticas.locadora.modelo;

public class LocacaoPorDia extends Locacao {

    public static final double TOTAL_HORAS_DIA = 24d;

    public LocacaoPorDia(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double dias = Math.ceil(horasUtilizadas / TOTAL_HORAS_DIA);
        return getNotebook().getPrecoPorDia() * dias;
    }
}
