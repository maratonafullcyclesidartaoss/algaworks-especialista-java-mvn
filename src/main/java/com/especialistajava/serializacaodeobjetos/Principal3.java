package com.especialistajava.serializacaodeobjetos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.READ;

public class Principal3 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/serializacaodeobjetos";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of(RELATIVE_PATH, "objetos", "joao.ser");

        try (ObjectInputStream leitor = new ObjectInputStream(Files.newInputStream(path, READ))) {
            Funcionario  funcionario = (Funcionario) leitor.readObject();
            System.out.println("funcionario: " + funcionario);
        }
    }
}
