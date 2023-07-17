package com.especialistajava.lancandoexcecoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    private static final String FILE = "/home/sidarta/Downloads/algaworks-especialista-java-mvn/src/main/java/com/especialistajava/lancandoexcecoes/teste.txt";

    public static void main(String[] args) {
        Path arquivo = Path.of(FILE);
        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine());

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Erro fechando leitor de arquivo.");
                }
            }
        }
    }
}
