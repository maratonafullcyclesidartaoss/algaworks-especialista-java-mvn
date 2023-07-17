package com.especialistajava.nio2.fragmentador;

import java.io.IOException;
import java.nio.file.Path;

public class Principal1 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/arquivos/fotos";

    public static void main(String[] args) throws IOException {
        var fragmentador = new FragmentadorDeArquivo(
            Path.of(RELATIVE_PATH, "picanha.jpg"),
            1024 * 50);
        fragmentador.fragmentar();
    }
}
