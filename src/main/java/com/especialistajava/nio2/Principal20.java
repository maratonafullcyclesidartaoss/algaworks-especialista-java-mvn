package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Principal20 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path path = Path.of(RELATIVE_PATH, "docs", "arquivo.txt");

        // métodos simples para escrita de arquivos

        // deseja escrever uma palavra ou uma sentença curta
//        Files.writeString(path, "Opa!");

        // salvar uma lista de strings dentro de um arquivo
//        var linhas = Arrays.asList("Opa!", "Beleza, mergulhador?");
//        Files.write(path, linhas);

//        byte[] bytes = { 79, 108, -61, -95 };
//        Files.write(path, bytes);
    }
}
