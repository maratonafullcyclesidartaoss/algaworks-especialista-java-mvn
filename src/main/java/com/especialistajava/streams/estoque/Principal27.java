package com.especialistajava.streams.estoque;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal27 {

    public static void main(String[] args) {
        String[] nomes = {"Maria", "Sebastião", "João"};

        // obter stream de outras fontes

        Arrays.stream(nomes)
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);

        Stream
            .iterate(new BigDecimal("1000"),
                valor -> valor.compareTo(BigDecimal.ZERO) >= 0,
                valor -> valor.subtract(new BigDecimal("10")))
            .forEach(System.out::println);

        // stream vazio
        Stream<Integer> stream = Stream.empty();

        // stream seqüencial com elementos especificados
        Stream.of(1, 2, 3, 4, 5, 6)
            .forEach(System.out::println);

        // trabalhando com stream de tipos primitivos
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
            .forEach(System.out::println);

        // poderia adicionar métodos de redução (sum, min, max, etc):
        int total = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
            .sum();

        System.out.println(total);

        // concatenar 2 streams
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(9, 8, 7);
        Stream.concat(stream1, stream2)
            .forEach(System.out::println);

        // gerar um stream de números de um intervalo (exclusive)
        IntStream.range(1, 10)
            .forEach(System.out::println);

        // gerar um intervalo fechado (inclusive)
        IntStream.rangeClosed(1, 10)
            .forEach(System.out::println);

        // saltar os 2 primeiros elementos (skip)
        IntStream.rangeClosed(1, 10)
            .skip(2)
            .forEach(System.out::println);

        // gerar números aleatórios
        // gerar 6 números aleatórios distintos
        Random random = new Random();
        Stream.generate(() -> random.nextInt(9) + 1)
            .distinct()
            .limit(6)
            .forEach(System.out::println);
    }
}
