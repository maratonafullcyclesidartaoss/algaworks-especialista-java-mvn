package com.especialistajava.io;

import java.io.*;
import java.util.Scanner;

public class Principal14 {


    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/documentos";

    public static void main(String[] args) throws IOException {
        String nome = "Sidarta";
//        PrintStream out = System.out;
        PrintStream out =
            new PrintStream(new FileOutputStream(
                new File(RELATIVE_PATH + "/arquivo.txt")));
        out.printf("Olá, %s %n", nome);
    }
}
