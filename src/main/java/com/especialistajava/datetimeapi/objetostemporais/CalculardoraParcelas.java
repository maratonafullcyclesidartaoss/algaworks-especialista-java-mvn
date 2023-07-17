package com.especialistajava.datetimeapi.objetostemporais;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculardoraParcelas {

    private static final DateTimeFormatter FORMATADOR_DATA =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String calcularParcelas(LocalDate dataPrimeiraParcela, int quantidadeParcelas) {
        StringBuilder parcelas = new StringBuilder(25);
        for (int i = 0; i < quantidadeParcelas; i++) {
            LocalDate dataProximaParcela = dataPrimeiraParcela.plusMonths(i);
            parcelas
                .append("Parcela #")
                .append(i + 1)
                .append(" - ")
                .append(FORMATADOR_DATA.format(i < 1 ? dataPrimeiraParcela : dataProximaParcela))
                .append("\n");
        }
        return parcelas.toString();
    }
}
