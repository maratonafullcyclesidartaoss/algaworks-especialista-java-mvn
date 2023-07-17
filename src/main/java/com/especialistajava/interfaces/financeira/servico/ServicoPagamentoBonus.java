package com.especialistajava.interfaces.financeira.servico;

import com.especialistajava.interfaces.financeira.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {

    public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada) {
        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

        System.out.printf("DEBUG: Bônus pago no valor de R$ %.2f", valorBonus);
    }
}
