package com.especialistajava.nio2;

import java.nio.file.Path;

public class Principal3 {

    public static void main(String[] args) {
        // Juntar arquivo, pasta ou arquivo, arquivo ou pasta, pasta
        // Juntar um path com outro
        Path pasta = Path.of("docs");
        Path arquivo = Path.of("contrato.txt");
        Path arquivoResolvido = pasta.resolve(arquivo);

        System.out.println(arquivoResolvido.toAbsolutePath());
    }
}
