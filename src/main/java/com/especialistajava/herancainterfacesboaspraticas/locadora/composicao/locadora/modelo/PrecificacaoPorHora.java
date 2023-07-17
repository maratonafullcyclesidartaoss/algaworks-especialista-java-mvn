package com.especialistajava.herancainterfacesboaspraticas.locadora.composicao.locadora.modelo;

public class PrecificacaoPorHora implements Precificacao {

    @Override
    public double calcularValorTotal(Notebook notebook, int horasUtilizadas) {
        return notebook.getPrecoPorHora() * horasUtilizadas;
    }
}
