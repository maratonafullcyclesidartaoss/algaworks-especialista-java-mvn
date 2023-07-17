package com.especialistajava.excecoes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    private static final String FILE = "/home/sidarta/Downloads/algaworks-especialista-java-mvn/src/main/java/com/especialistajava/excecoes/teste.txt";

    public static void main(String[] args) {
        try {
            Path arquivo = Path.of(FILE);
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo " + e.getMessage());
            e.printStackTrace();
        }
    }
}
