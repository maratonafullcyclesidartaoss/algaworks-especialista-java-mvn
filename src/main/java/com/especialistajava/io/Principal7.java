package com.especialistajava.io;

import java.io.*;

public class Principal7 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/documentos/contrato.txt";

    public static void main(String[] args) {
        // ler o conteúdo de um arquivo usando byte oriented stream
        File arquivoOrigem = new File(RELATIVE_PATH);

        // fluxo de entrada - ler arquivo
        try (InputStream inputStream = new FileInputStream(arquivoOrigem)) {
            int conteudo = 0;

            while ((conteudo = inputStream.read()) != -1) {
                System.out.print((char) conteudo);
            }
//            System.out.println(inputStream.read());

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }


    }
}
