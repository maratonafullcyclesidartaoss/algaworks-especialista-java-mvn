package com.especialistajava.interfaces.financeira;

import com.especialistajava.interfaces.financeira.modelo.Fazenda;
import com.especialistajava.interfaces.financeira.modelo.Funcionario;
import com.especialistajava.interfaces.financeira.modelo.Industria;
import com.especialistajava.interfaces.financeira.modelo.ParceiroFinanceiro;
import com.especialistajava.interfaces.financeira.servico.ServicoFinanciamento;

public class Principal1 {

    public static void main(String[] args) {
        ServicoFinanciamento servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, false);
        var parceiro = new ParceiroFinanceiro("Capital ABC", 2_000_000);
        var funcionario = new Funcionario("João da Silva", 18_000);

        servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 400_000);

    }
}
