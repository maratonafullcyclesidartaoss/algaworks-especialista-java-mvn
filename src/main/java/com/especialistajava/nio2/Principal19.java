package com.especialistajava.nio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class Principal19 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path path = Path.of(RELATIVE_PATH, "docs", "poema.txt");

        // arquivos de texto
//        try (Stream<String> stream = Files.lines(path)) {
//            stream.forEach(System.out::println);
//        }

        // SOMENTE para arquivos pequenos: arquivos de texto
//        Files.readAllLines(path)
//            .forEach(System.out::println);


        // SOMENTE para arquivos pequenos: arquivos de texto
//        String conteudo = Files.readString(path);
//        System.out.println(conteudo);

        // SOMENTE para arquivos pequenos: arquivos binários
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(Arrays.toString(bytes));
    }
}
