package com.especialistajava.nio2.fragmentador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Principal3 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/arquivos";

    public static void main(String[] args) throws IOException {
        var escritor = new EscritorArquivoMaiusculo(
            Path.of(RELATIVE_PATH + "/poema1.txt"),
            Path.of(RELATIVE_PATH + "/poema2.txt"));
        escritor.processar();
    }
}
