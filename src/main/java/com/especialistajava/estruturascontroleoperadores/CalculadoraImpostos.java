package com.especialistajava.estruturascontroleoperadores;

public class CalculadoraImpostos {

    public static void main(String[] args) {
        /**
         * P - produto
         * S - serviço
         */
        char tipoNotaFiscal = 'S';
        double totalFaturado = 1200.3;

        double valorImpostos = 0;

        /*
        if (tipoNotaFiscal == 'S') {
            valorImpostos = totalFaturado * 0.16;
        } else {
            valorImpostos = totalFaturado * 0.35;
        }
        */
        double taxaImpostos = tipoNotaFiscal == 'S' ? 0.16 : 0.35;
        valorImpostos = totalFaturado * taxaImpostos;

        System.out.printf("Total faturado: R$ %.2f%n", totalFaturado);
        System.out.printf("Valor dos impostos: R$ %.2f%n", valorImpostos);
    }
}