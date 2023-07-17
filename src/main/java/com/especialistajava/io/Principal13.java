package com.especialistajava.io;

import java.io.*;
import java.util.Scanner;

public class Principal13 {


    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/io/documentos";

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//
//        String linha = null;
//        while (!(linha = scanner.nextLine()).equals("sair")) {
//            System.out.println("Você digitou: " + linha);
//        }

        // Com Buffer
//        InputStream inputStream = System.in;
//        BufferedReader leitor = new BufferedReader(new InputStreamReader(inputStream));
//
//        String linha = null;
//        while (!(linha = leitor.readLine()).equals("sair")) {
//            System.out.println("Você digitou: " + linha);
//        }

        // Usar Scanner para ler arquivos
        Scanner scanner = new Scanner(new FileInputStream(
            new File(RELATIVE_PATH + "/lista.txt")));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
