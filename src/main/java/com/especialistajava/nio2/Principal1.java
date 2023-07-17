package com.especialistajava.nio2;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.concurrent.locks.ReentrantLock;

public class Principal1 {

    private static final String ABSOLUTE_PATH =
        "/home/sidarta/Downloads/algaworks-especialista-java-mvn/src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) {
        // Um Path depende do Sistema de Arquivos
        FileSystem fs = FileSystems.getDefault();
        System.out.println(fs);
        Path arquivo1 = fs.getPath(ABSOLUTE_PATH + "/docs/contrato.txt");
        System.out.println(arquivo1);
        Path nomeArquivo = arquivo1.getFileName();
        System.out.println("nomeArquivo: " + nomeArquivo);

        Path pastaPai = arquivo1.getParent();
        System.out.println("pastaPai: " + pastaPai);

        Path arquivo2 = fs.getPath(ABSOLUTE_PATH , "docs", "contrato.txt");
        System.out.println("arquivo2: " + arquivo2);

        // Método de conveniência: a partir do Java 11. Já chama o FileSystem.
        Path arquivo3 = Path.of(ABSOLUTE_PATH, "docs", "contrato.txt");
        System.out.println("arquivo3: " + arquivo3);

        // Usando nova API com API clássica de IO: como converter
        File arquivo4 = arquivo3.toFile();
        System.out.println("arquivo4: " + arquivo4);
        Path arquivo5 = arquivo4.toPath();
        System.out.println("arquivo5: " + arquivo5);
    }
}
