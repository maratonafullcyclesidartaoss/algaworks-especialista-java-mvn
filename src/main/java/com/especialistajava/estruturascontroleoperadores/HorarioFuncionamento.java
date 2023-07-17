package com.especialistajava.estruturascontroleoperadores;

import java.util.Scanner;

public class HorarioFuncionamento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dia da semana (seg, ter, qua, qui, sex, sab, dom): ");
        String diaSemana = entrada.nextLine();

        System.out.println("Mês: ");
        int mes = entrada.nextInt();

//        String horarioFuncionamento = null;

//        switch (diaSemana) {
//            case "seg":
//                horarioFuncionamento = "Fechado";
//                break;
//            case "ter":
//            case "qua":
//            case "qui":
//            case "sex":
//                horarioFuncionamento = "08:00 às 18:00";
//                break;
//            case "sab":
//            case "dom":
//                horarioFuncionamento = "08:00 às 12:00";
//                break;
//            default:
//                horarioFuncionamento = "Dia inválido";
//        }

//        switch (diaSemana) {
//            case "seg" -> horarioFuncionamento = "Fechado";
//            case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 às 18:00";
//            case "sab", "dom" -> {
//                horarioFuncionamento = "08:00 às 12:00";
//            }
//            default -> horarioFuncionamento = "Dia inválido";
//        }

        String horarioFuncionamento = switch (diaSemana) {
            case "seg" -> {
                if (mes == 12) {
                    yield "08:00 às 16:00";
                }
                yield "Fechado";
            }
            case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
            case "sab", "dom" -> "08:00 às 12:00";
            default -> "Dia inválido";
        };

        System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
    }
}