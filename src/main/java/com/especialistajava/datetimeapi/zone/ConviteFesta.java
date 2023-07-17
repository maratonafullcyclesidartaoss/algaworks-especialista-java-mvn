package com.especialistajava.datetimeapi.zone;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class ConviteFesta {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA_COMPLETA =
        DateTimeFormatter
            .ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm");
    private static final DateTimeFormatter FORMATADOR_DATA =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_HORARIO =
        DateTimeFormatter.ofPattern("HH:mm");

    public static void main(String[] args) {
        LocalDate dataDaFesta = solicitarDataDaFesta();
        LocalTime horarioDaFesta = solicitarHorarioDaFesta();
        LocalDateTime dataHoraDaFesta = LocalDateTime.of(dataDaFesta, horarioDaFesta);

        ZonedDateTime dataDaFestaFusoPadrao = dataHoraDaFesta.atZone(ZoneId.systemDefault());
        System.out.printf("%s (Horário Padrão de Brasília)%n",
            dataDaFestaFusoPadrao.format(FORMATADOR_DATA_COMPLETA));

        ZonedDateTime dataDaFestaFusoLosAngeles = dataDaFestaFusoPadrao
            .withZoneSameInstant(ZoneId
                .of("America/Los_Angeles"));
        System.out.printf("%s (Horário de Verão do Pacífico)%n",
            dataDaFestaFusoLosAngeles.format(FORMATADOR_DATA_COMPLETA));

        ZonedDateTime dataDaFestaFusoJapao = dataDaFestaFusoPadrao
            .withZoneSameInstant(ZoneId
                .of("Japan"));
        System.out.printf("%s (Horário Padrão do Japão)%n",
            dataDaFestaFusoJapao.format(FORMATADOR_DATA_COMPLETA));
    }

    public static LocalDate solicitarDataDaFesta() {
        while (true) {
            try {
                System.out.print("Data local da festa: ");
                String dataLocalDaFestaEmTexto = ENTRADA.nextLine();
                return LocalDate.parse(dataLocalDaFestaEmTexto, FORMATADOR_DATA);
            } catch (DateTimeParseException dtpe) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
    }

    public static LocalTime solicitarHorarioDaFesta() {
        while (true) {
            try {
                System.out.print("Horário local da festa: ");
                String horarioLocalDaFestaEmTexto = ENTRADA.nextLine();
                return LocalTime.parse(horarioLocalDaFestaEmTexto, FORMATADOR_HORARIO);
            } catch (DateTimeParseException dtpe) {
                System.out.println("Horário inválido. Tente novamente.");
            }
        }
    }
}
