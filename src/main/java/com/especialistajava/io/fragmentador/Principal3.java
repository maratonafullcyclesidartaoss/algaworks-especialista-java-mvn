package com.especialistajava.io.fragmentador;

import java.io.File;
import java.io.IOException;

public class Principal3 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/arquivos";

    public static void main(String[] args) throws IOException {
        var escritor = new EscritorArquivoMaiusculo(
            new File(RELATIVE_PATH + "/poema1.txt"),
            new File(RELATIVE_PATH + "/poema2.txt"));
        escritor.processar();
    }
}
