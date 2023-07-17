package com.especialistajava.io;

import java.io.*;

public class Principal10 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/documentos";

    public static void main(String[] args) {
        String[] nomes = { "João", "Maria", "Sebastião", "José" };
        File arquivoDestino = new File(RELATIVE_PATH + "/lista.txt");

        try (Writer escritor = new FileWriter(arquivoDestino)) {
            for (String nome : nomes) {
                escritor.write(nome + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }


    }
}
