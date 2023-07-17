package com.especialistajava.datetimeapi.duration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class IdadePaciente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Data de nascimento: ");
                String dataDeNascimentoTexto = scanner.nextLine();
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataNascimento = LocalDate.parse(dataDeNascimentoTexto, formatador);
                Period periodo = dataNascimento.until(LocalDate.now());
                System.out.printf("Paciente tem: %d %s, %d %s e %d %s de vida",
                    periodo.getYears(),
                    periodo.getYears() > 1 ? "anos" : "ano",
                    periodo.getMonths(),
                    periodo.getMonths() > 1 ? "meses" : "mês",
                    periodo.getDays(),
                    periodo.getDays() > 1 ? "dias" : "dia");
                break;
            } catch (DateTimeParseException dtpe) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }


    }
}
