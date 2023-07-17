package com.especialistajava.boaspraticasecodigolimpo;

public class Cliente {

    public static final double TAXA_LIMITE_CREDITO = 0.1;
    public static final double LIMITE_CREDITO_MINIMO = 10_000;

    String razaoSocial;
    double faturamentoAnual;

    double calcularLimiteCredito() {
        double limiteCredito = this.faturamentoAnual * TAXA_LIMITE_CREDITO;
        if (limiteCredito < LIMITE_CREDITO_MINIMO) {
            limiteCredito = LIMITE_CREDITO_MINIMO;
        }
        return limiteCredito;
    }
}