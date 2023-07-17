package com.especialistajava.interfaces;

import com.especialistajava.interfaces.contaspagar.modelo.Holerite;
import com.especialistajava.interfaces.contaspagar.modelo.OrdemServico;
import com.especialistajava.interfaces.contaspagar.servico.ServicoContaPagar;
import com.especialistajava.interfaces.pagamento.Beneficiario;
import com.especialistajava.interfaces.pagamento.MetodoPagamento;
import com.especialistajava.interfaces.pagamento.Pix;
import com.especialistajava.interfaces.pagamento.Transferencia;

public class Principal {

    public static void main(String[] args) {
//        MetodoPagamento pix = new Pix();
        MetodoPagamento transferencia = new Transferencia();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(transferencia);

        Beneficiario funcionario =
            new Beneficiario("João da Silva", "34999998888", "999999");
        Holerite holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor =
            new Beneficiario("Consultoria Xyz", "16888897777", "888666");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);
    }
}
