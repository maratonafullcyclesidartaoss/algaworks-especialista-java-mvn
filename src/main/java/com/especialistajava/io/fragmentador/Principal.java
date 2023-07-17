package com.especialistajava.io.fragmentador;

import java.io.File;
import java.io.IOException;

public class Principal {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/arquivos/fotos";

    public static void main(String[] args) throws IOException {
        var fragmentador = new FragmentadorDeArquivo(
            new File(RELATIVE_PATH + "/picanha.jpg"),
            1024 * 50
        );
        fragmentador.fragmentar();
    }
}
