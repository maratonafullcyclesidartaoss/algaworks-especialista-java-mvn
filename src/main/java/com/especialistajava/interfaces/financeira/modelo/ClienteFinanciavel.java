package com.especialistajava.interfaces.financeira.modelo;

public interface ClienteFinanciavel {

    int JUROS_BAIXO_RISCO = 1;
    double JUROS_MEDIO_RISCO = 1.5;
    int JUROS_ALTO_RISCO = 2;

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPequenoValor(valorSolicitado)) {
            return JUROS_BAIXO_RISCO;
        } else if (isFinanciamentoGrandeValor(valorSolicitado)) {
            return JUROS_MEDIO_RISCO;
        }
        return JUROS_ALTO_RISCO;
    }

    static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }
}
