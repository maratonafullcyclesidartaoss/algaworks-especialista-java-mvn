package com.especialistajava.herancainterfacesboaspraticas.locadora.modelo;

public class LocacaoPorHora extends Locacao {

    public LocacaoPorHora(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        return getNotebook().getPrecoPorHora() * horasUtilizadas;
    }
}
