package com.especialistajava.serializacaodeobjetos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Serializacao {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/serializacaodeobjetos";

    public static void main(String[] args) throws IOException {
        Endereco endereco =
            new Endereco("Rua das Ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco,
            BigDecimal.valueOf(100000));

        System.out.println(cliente);

        Path path = Path.of(RELATIVE_PATH, "objetos", "cliente.ser");

        // TODO Serializar
        try (ObjectOutputStream escritor = new ObjectOutputStream(Files.newOutputStream(path, WRITE, CREATE))) {
            escritor.writeObject(cliente);
        }
    }
}
