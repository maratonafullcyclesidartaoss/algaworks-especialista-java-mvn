package com.especialistajava.datetimeapi.zone;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal12 {

    public static void main(String[] args) {
        Duration duracaoVoo = Duration.parse("PT12H22M");
        ZonedDateTime dataHoraDecolagem = ZonedDateTime
            .parse("2023-11-20T20:00:00-03:00[America/Sao_Paulo]");

        ZonedDateTime dataHoraPousoPrevisto = dataHoraDecolagem
            .withZoneSameInstant(ZoneId.of("America/Los_Angeles"))
            .plus(duracaoVoo);

        System.out.println(dataHoraDecolagem);
        System.out.println(dataHoraPousoPrevisto);
    }
}
