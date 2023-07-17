package com.especialistajava.upcastingdereferencias.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

    public void transferir(ContaNormal contaOrigem, ContaNormal contaDestino,
                           double valorTransferencia) {
        System.out.printf("Transferindo R$ %.2f da conta %d/%d para %d/%d%n", valorTransferencia,
            contaOrigem.getAgencia(), contaOrigem.getNumero(),
            contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

//    public void imprimirDemonstrativo(ContaNormal contaNormal) {
//        this.debitarTarifaImpressaoDemonstrativo(contaNormal);
//        contaNormal.imprimirDemonstrativo();
//    }
//
//    public void imprimirDemonstrativo(ContaInvestimento contaInvestimento) {
//        if (contaInvestimento.getValorTotalRendimentos() > 0) {
//            System.out.println("Impressão do demonstrativo é gratuita.");
//        } else {
//            this.debitarTarifaImpressaoDemonstrativo(contaInvestimento);
//        }
//        contaInvestimento.imprimirDemonstrativo();
//    }

    public void imprimirDemonstrativo(ContaNormal contaNormal) {
        if (contaNormal.possuiGratuidadeImpressao()) {
            System.out.println("Impressão do demonstrativo é gratuita.");
        } else {
            debitarTarifaImpressaoDemonstrativo(contaNormal);
        }
        contaNormal.imprimirDemonstrativo();
    }

    private void debitarTarifaImpressaoDemonstrativo(ContaNormal contaNormal) {
        System.out.printf("Custo da impressão: R$ %.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
        contaNormal.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
    }
}
