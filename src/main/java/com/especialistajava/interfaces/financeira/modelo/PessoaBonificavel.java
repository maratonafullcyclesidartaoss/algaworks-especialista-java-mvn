package com.especialistajava.interfaces.financeira.modelo;

public interface PessoaBonificavel extends ClienteFinanciavel {

    double calcularBonus(double percentualMetaAlcancada);
}
