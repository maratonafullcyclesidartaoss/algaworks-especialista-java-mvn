package com.especialistajava.serializacaodeobjetos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Principal {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/serializacaodeobjetos";

    public static void main(String[] args) throws IOException {
        Funcionario funcionario = new Funcionario("João",
            LocalDate.of(2005, Month.MARCH, 2),
            new BigDecimal("25000"));

        System.out.println(funcionario);

        Path path = Path.of(RELATIVE_PATH, "objetos", "joao.ser");

//        try (var outputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
//            outputStream.writeObject(funcionario);
//        }

        try (var outputStream = new ObjectOutputStream(Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(funcionario);
        }
    }
}
