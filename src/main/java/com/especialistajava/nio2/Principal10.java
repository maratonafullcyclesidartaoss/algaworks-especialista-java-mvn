package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

public class Principal10 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path pastaDocs = Path.of(RELATIVE_PATH, "docs");

        // está abrindo o fluxo de IO. Precisa fechar. Usar try with resources
        try (var stream = Files.list(pastaDocs)) {
            stream
                .filter(Files::isRegularFile)
                .map(Path::getFileName)
                .forEach(System.out::println);
        }

        System.out.println("---------------");

        try (var stream = Files.list(pastaDocs)) {
            stream
                .filter(Files::isDirectory)
                .map(Path::getFileName)
                .forEach(System.out::println);
        }

        // filtrar arquivos com extensão .txt

        System.out.println("---------------");

        try (var stream = Files.list(pastaDocs)) {
            stream
                .filter(Files::isRegularFile)
                .map(Path::getFileName)
                .map(Path::toString)
                .filter(nome -> nome.matches(".*\\.txt"))
                .forEach(System.out::println);
        }
    }
}
