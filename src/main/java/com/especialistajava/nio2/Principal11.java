package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Principal11 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path pastaDocs = Path.of(RELATIVE_PATH, "docs");

        // Pesquisar todos os arquivos .txt, incluindo toda a hierarquia
        try (Stream<Path> stream = Files.find(pastaDocs, Integer.MAX_VALUE,
            (path, attrs) -> path.getFileName().toString()
                .matches(".*\\.txt"))) {
            stream.forEach(System.out::println);
        }


    }
}
