package com.especialistajava.io;

import java.io.*;

public class Principal12 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/documentos";

    public static void main(String[] args) {
        File arquivoOrigem = new File(RELATIVE_PATH + "/lista.txt");
        File arquivoDestino = new File(RELATIVE_PATH + "/saida.txt");

        try (Reader leitor = new FileReader(arquivoOrigem);
            Writer escritor = new BufferedWriter(new FileWriter(arquivoDestino))) {

            int conteudo = 0;
            while ((conteudo = leitor.read()) != -1) {
                escritor.write(conteudo);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
