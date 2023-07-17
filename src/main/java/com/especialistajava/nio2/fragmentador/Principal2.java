package com.especialistajava.nio2.fragmentador;

import java.io.IOException;
import java.nio.file.Path;

public class Principal2 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/arquivos/fotos";

    public static void main(String[] args) throws IOException {
        var unificador =
            new UnificadorDeArquivos(
                Path.of(RELATIVE_PATH),
                Path.of(RELATIVE_PATH, "picanha-unificado.jpg"), "picanha.jpg");
        unificador.unificar();
    }
}
