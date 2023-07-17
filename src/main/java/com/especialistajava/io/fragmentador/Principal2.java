package com.especialistajava.io.fragmentador;

import java.io.File;
import java.io.IOException;

public class Principal2 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/arquivos/fotos";

    public static void main(String[] args) throws IOException {
        var unificador = new UnificadorDeArquivos(
            new File(RELATIVE_PATH),
            new File(RELATIVE_PATH + "/picanha-unificado.jpg"),
            "picanha.jpg"
        );
        unificador.unificar();
    }
}
