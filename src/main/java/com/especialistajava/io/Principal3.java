package com.especialistajava.io;

import java.io.File;

public class Principal3 {

    public static void main(String[] args) {
        File pasta1 = new File("src/main/java/com/especialistajava/io/docs");
        File pasta2 = new File("src/main/java/com/especialistajava/io/documentos/fotos");

        File arquivo1 = new File(pasta2, "contrato.txt");

//        System.out.println(pasta1.renameTo(pasta2));
        System.out.println(pasta2.delete());
//        System.out.println(arquivo1.delete());



    }
}
