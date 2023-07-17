package com.especialistajava.streams.estoque;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal28 {

    public static void main(String[] args) {
        String nome = "João";

        // EVITAR
//        if (Objects.nonNull(nome)) {
//            System.out.println("Nome informado");
//        }

        // EVITAR
//        if (Objects.isNull(nome)) {
//            System.out.println("Nome não informado");
//        }

        // Mais legível
        if (nome != null) {
            System.out.println("Nome informado");
        }

        // Mais legível
        if (nome == null) {
            System.out.println("Nome não informado");
        }

        // filtrar apenas valores não nulos
        Stream.of("João", null, "Maria", null)
            .filter(Objects::nonNull)
            .forEach(System.out::println);

        System.out.println();

        // filtrar apenas valores nulos
        Stream.of("João", null, "Maria", null)
            .filter(Objects::isNull)
            .forEach(System.out::println);

    }
}
