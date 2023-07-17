package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Principal5 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path pastaFornecedores = Path.of(RELATIVE_PATH, "docs", "contratos", "fornecedores");
        Path arquivoContrato = Path.of("contrato-venda.txt");
        Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivoContrato);

        // copiar contrato-venda.txt para a pasta docs/contratos/clientes
        Path pastaClientes = Path.of(RELATIVE_PATH, "docs", "contratos", "clientes");
        Path arquivoContratoDestino = pastaClientes.resolve(arquivoContrato);

        System.out.println(arquivoContratoOrigem);
        System.out.println(arquivoContratoDestino);

        Files.copy(arquivoContratoOrigem, arquivoContratoDestino,
            StandardCopyOption.REPLACE_EXISTING);

        Path pastaParceiros = Path.of(RELATIVE_PATH, "docs", "contratos", "parceiros");

        Files.copy(pastaFornecedores, pastaParceiros);
    }
}
