package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;

public class Principal9 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {

        Path arquivo = Path.of(RELATIVE_PATH, "docs", "arquivo.txt");

        System.out.println("Tamanho: " + Files.size(arquivo));
        System.out.println("É arquivo: " + Files.isRegularFile(arquivo));
        System.out.println("É diretório: " + Files.isDirectory(arquivo));

        System.out.println("Last modified time: " + Files.getLastModifiedTime(arquivo));

        Instant ultimaAlteracao = Files.getLastModifiedTime(arquivo).toInstant();
        System.out.println("Última alteração: " + ultimaAlteracao);

        System.out.println("É oculto: " + Files.isHidden(arquivo));
        System.out.println("Pode ler: " + Files.isReadable(arquivo));
        System.out.println("Pode escrever: " + Files.isWritable(arquivo));
        System.out.println("Pode executar: " + Files.isExecutable(arquivo));
    }
}
