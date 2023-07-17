package com.especialistajava.datetimeapi.objetostemporais;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal8 {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        LocalDate dataDaPrimeiraParcela = solicitarDataDaPrimeiraParcela();
        System.out.print("Quantidade de parcelas: ");
        int quantidadeDeParcelas = ENTRADA.nextInt();

        System.out.println(CalculardoraParcelas
            .calcularParcelas(dataDaPrimeiraParcela, quantidadeDeParcelas));
    }

    private static LocalDate solicitarDataDaPrimeiraParcela() {
        while (true) {
            try {
                System.out.print("Data da primeira parcela: ");
                String dataDaPrimeiraParcelaEmTexto = ENTRADA.nextLine();
                return LocalDate.parse(dataDaPrimeiraParcelaEmTexto, FORMATADOR_DATA);
            } catch (DateTimeParseException dtpe) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
    }
}
