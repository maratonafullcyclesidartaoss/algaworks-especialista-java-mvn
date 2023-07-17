package com.especialistajava.trabalhandocomarrays;

public class PrincipalServicoDeCobranca {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();
//        servicoDeCobranca.pagar(fatura, "joe@joe.com");
        servicoDeCobranca.pagar(fatura, "joe@joe.com", "maria@maria.com", "jose@jose.com");

        double mediaDasParcelasPagas = servicoDeCobranca.calcularMediaDasParcelasPagas(987.3, 987.3, 1340.4, 1240.4, 987.3);
        System.out.printf("Média das parcelas pagas: R$ %.2f%n", mediaDasParcelasPagas);
    }
}