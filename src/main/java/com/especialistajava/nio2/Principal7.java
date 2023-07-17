package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal7 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path arquivoContrato = Path.of(RELATIVE_PATH, "docs", "contratos", "fornecedores", "contrato-venda.txt");
//        Files.delete(arquivoContrato);
        Files.deleteIfExists(arquivoContrato);

        Path pastaFornecedores = Path.of(RELATIVE_PATH, "docs", "contratos", "fornecedores");
        Files.deleteIfExists(pastaFornecedores);

        Path pastaClientes = Path.of(RELATIVE_PATH, "docs", "contratos", "clientes");
        Files.deleteIfExists(pastaClientes);
    }
}
