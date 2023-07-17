package com.especialistajava.io;

import java.io.*;

public class Principal8 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/documentos";

    public static void main(String[] args) {
        File arquivoOrigem = new File(RELATIVE_PATH + "/fincycle.png");
        File arquivoDestino = new File(RELATIVE_PATH + "/superfincycle.png");

        try (InputStream inputStream = new FileInputStream(arquivoOrigem);
            OutputStream outputStream = new FileOutputStream(arquivoDestino)) {

            byte[] conteudo = new byte[1024]; // 1KB - LER 1KB POR 1KB
            int quantidadeBytes = 0;

            // LENDO A PARTIR DE UM BUFFER
            while ((quantidadeBytes = inputStream.read(conteudo)) > 0) {
                outputStream.write(conteudo, 0, quantidadeBytes);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }


    }
}
