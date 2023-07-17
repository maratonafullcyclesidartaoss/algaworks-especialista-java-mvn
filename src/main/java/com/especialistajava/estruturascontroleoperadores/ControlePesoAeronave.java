package com.especialistajava.estruturascontroleoperadores;

import java.util.Scanner;

public class ControlePesoAeronave {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso máximo da aeronave: ");
        int pesoMaximo = entrada.nextInt();

//        System.out.print("Quantidade de passageiros: ");
//        int totalPassageiros = entrada.nextInt();

        int pesoTotalPassageiros = 0;

        /*
        for (int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++) {
            System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
            int pesoPassageiro = entrada.nextInt();

            pesoTotalPassageiros += pesoPassageiro;
        }
         */

//        int passageiroAtual = 1;

//        while (passageiroAtual <= totalPassageiros) {
//            System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
//            int pesoPassageiro = entrada.nextInt();
//            pesoTotalPassageiros += pesoPassageiro;
//            passageiroAtual++;
//        }
//        while (passageiroAtual <= totalPassageiros) {
//        boolean incluirNovoPassageiro = true;
        while (true) {
//            System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
            System.out.print("Peso do passageiro: ");
            int pesoPassageiro = entrada.nextInt();

            int pesoAdicional = pesoTotalPassageiros + pesoPassageiro;

            if (pesoAdicional > pesoMaximo) {
                System.out.printf("Peso atual: %d. Excedeu o peso máximo: %d%n", pesoTotalPassageiros, pesoMaximo);
                continue;
            }

            pesoTotalPassageiros += pesoPassageiro;
//            passageiroAtual++;

            System.out.print("Incluir novo passageiro? ");
            boolean incluirNovoPassageiro = entrada.nextBoolean();
            boolean pesoExcedido = pesoTotalPassageiros >= pesoMaximo;
            if (!incluirNovoPassageiro || pesoExcedido) {
                break;
            }
        }

        System.out.printf("Peso máximo da aeronave: %dKg%n", pesoMaximo);
        System.out.printf("Peso total dos passageiros: %dKg%n", pesoTotalPassageiros);

        String situacaoAeronave = pesoTotalPassageiros > pesoMaximo ? "PESO EXCEDIDO" : "LIBERADA";
        System.out.printf("Situação da aeronave: %s%n", situacaoAeronave);
    }
}