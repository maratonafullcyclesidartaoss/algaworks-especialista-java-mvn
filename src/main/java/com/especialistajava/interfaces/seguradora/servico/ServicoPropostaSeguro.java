package com.especialistajava.interfaces.seguradora.servico;

import com.especialistajava.interfaces.seguradora.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {
        double valorPremio = bem.calcularValorPremio();
        System.out.println("------------------------------");
        System.out.println("Proposta de seguro");
        System.out.println("------------------------------");
        System.out.printf("%s%n", bem.descrever());
        System.out.printf("Prêmio: R$ %.2f%n", valorPremio);
    }
}
