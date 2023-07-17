package com.especialistajava.interfaces.financeira;

import com.especialistajava.interfaces.financeira.modelo.Funcionario;
import com.especialistajava.interfaces.financeira.modelo.PessoaBonificavel;
import com.especialistajava.interfaces.financeira.servico.ServicoPagamentoBonus;

public class Principal2 {

    public static void main(String[] args) {
        PessoaBonificavel funcionario = new Funcionario("João da Silva", 18_000);

        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagar(funcionario, 80);
    }
}
