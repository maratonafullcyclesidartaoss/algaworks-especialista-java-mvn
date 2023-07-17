package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Principal6 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path pastaFornecedores = Path.of(RELATIVE_PATH, "docs", "contratos", "fornecedores");
        Path pastaClientes = Path.of(RELATIVE_PATH, "docs", "contratos", "clientes");
        Path arquivoContrato = Path.of("contrato-venda.txt");

        Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivoContrato);
        Path arquivoContratoDestino = pastaClientes.resolve(arquivoContrato);

        // mover arquivos, diretórios de origem para destino
//        Files.move(arquivoContratoOrigem, arquivoContratoDestino);

        Path pastaVendas = Path.of(RELATIVE_PATH, "docs", "vendas");

        Files.move(pastaClientes, pastaVendas);
    }
}
