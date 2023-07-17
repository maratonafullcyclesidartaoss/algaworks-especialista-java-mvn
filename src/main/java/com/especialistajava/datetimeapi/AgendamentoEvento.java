package com.especialistajava.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEvento {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_HORA =
        DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADOR_DATA_HORA =
        DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM)
            .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {
        LocalDate data = solicitarDataDoEvento();
        LocalTime hora = solicitarHoraDoEvento();

        LocalDateTime dataHora = LocalDateTime.of(data, hora);

        System.out.printf("Evento agendado para %s%n",
                FORMATADOR_DATA_HORA.format(dataHora));
    }

    private static LocalDate solicitarDataDoEvento() {
        while (true) {
            try {
                System.out.print("Data do evento: ");
                String dataDoEvento = ENTRADA.nextLine();
                return LocalDate.parse(dataDoEvento, FORMATADOR_DATA);
            } catch (DateTimeParseException dtpe) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
    }

    private static LocalTime solicitarHoraDoEvento() {
        while (true) {
            try {
                System.out.print("Hora do evento: ");
                String dataDoEvento = ENTRADA.nextLine();
                return LocalTime.parse(dataDoEvento, FORMATADOR_HORA);
            } catch (DateTimeParseException dtpe) {
                System.out.println("Hora inválida. Tente novamente.");
            }
        }
    }
}
