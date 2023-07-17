package com.especialistajava.serializacaodeobjetos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.READ;

public class Desserializacao {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/serializacaodeobjetos";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of(RELATIVE_PATH, "objetos", "cliente.ser");

        try (ObjectInputStream leitor = new ObjectInputStream(Files.newInputStream(path, READ))) {
            Cliente cliente = (Cliente) leitor.readObject();
            System.out.println("cliente: " + cliente);
        }
    }
}
