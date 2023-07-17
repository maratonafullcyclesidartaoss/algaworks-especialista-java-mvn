package com.especialistajava.io;

import java.io.File;
import java.io.IOException;

public class Principal1 {

    private static final String ABSOLUTE_PATH =
        "/home/sidarta/Downloads/algaworks-especialista-java-mvn/src/main/java/com/especialistajava/io/docs";

    public static void main(String[] args) throws IOException {
        File pasta1 = new File(ABSOLUTE_PATH);
        System.out.printf("Pasta 1 criada: %b%n", pasta1.mkdir());

        File pasta2 = new File(ABSOLUTE_PATH + "/fotos/viagens");
        System.out.printf("Pasta 2 criada: %b%n", pasta2.mkdirs());

        File arquivo1 = new File(ABSOLUTE_PATH);
        File arquivo2 = new File(ABSOLUTE_PATH + "/contrato.txt");
        File arquivo3 = new File(ABSOLUTE_PATH, "contrato.txt");
        File arquivo4 = new File(pasta1, "contrato.txt");

        System.out.printf("Arquivo 4 criado: %b%n", arquivo4.createNewFile());


    }
}
