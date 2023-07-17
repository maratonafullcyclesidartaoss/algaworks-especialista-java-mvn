package com.especialistajava.io;

import java.io.*;

public class Principal11 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/documentos";

    public static void main(String[] args) {
        File arquivoOrigem = new File(RELATIVE_PATH + "/lista.txt");

        // LER O ARQUIVO LINHA A LINHA. PARA ISSO, UTILIZAR A CLASSE BUFFEREDREADER
        // CLASSE ORIENTADA A LINHA
        // CAPACIDADE DE FAZER BUFFER DURANTE A LEITURA
        // OTIMIZADA PARA LER LOTES DE DADOS E ARMAZENAR EM UMA MEMÓRIA TEMPORÁRIA (BUFFER)
        // PARA EVITAR FAZER MUITAS CHAMADAS NO SISTEMA DE ARQUIVOS
        // DEVE-SE UTILIZAR PARA LER GRANDES ARQUIVOS
        // LÊ POR PADRÃO EM BLOCOS DE 8KB

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOrigem))) {
            String linha = null;

            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
