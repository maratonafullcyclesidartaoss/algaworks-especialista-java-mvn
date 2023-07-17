package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal4 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
//        Path pastaDocs = Path.of(RELATIVE_PATH, "docs");
//        Files.createDirectory(pastaDocs);

        Path pastaFornecedores = Path.of(RELATIVE_PATH, "docs", "contratos", "fornecedores");
        Files.createDirectories(pastaFornecedores);

        Path arquivoContrato = pastaFornecedores.resolve(Path.of("contrato-venda.txt"));
        System.out.println(arquivoContrato);
        Files.createFile(arquivoContrato);
        System.out.println(Files.exists(arquivoContrato));
    }
}
