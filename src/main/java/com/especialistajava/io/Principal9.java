package com.especialistajava.io;

import java.io.*;

public class Principal9 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/documentos";

    public static void main(String[] args) {
        File arquivoOrigem = new File(RELATIVE_PATH + "/contrato.txt");
        StringBuilder texto = new StringBuilder(1000);

        try (Reader leitor = new FileReader(arquivoOrigem)) {
            // buffer de x caracteres
            char[] conteudo = new char[1000];
            int quantidadeCaracteres = 0;

            while ((quantidadeCaracteres = leitor.read(conteudo)) > 0) {
                texto.append(conteudo, 0, quantidadeCaracteres);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

        System.out.println(texto.toString());
    }
}
