package com.especialistajava.io;

import java.io.File;
import java.io.IOException;

public class Principal2 {

    private static final String ABSOLUTE_PATH =
        "/home/sidarta/Downloads/algaworks-especialista-java-mvn/src/main/java/com/especialistajava/io/docs";

    public static void main(String[] args) throws IOException {
        File arquivo1 = new File(ABSOLUTE_PATH + "/contrato.txt");
        System.out.println(arquivo1);
        System.out.println();

        // caminho relativo: a partir da pasta raiz do projeto até um arquivo ou pasta
        File arquivo2 = new File("src/main/java/com/especialistajava/io/docs/contrato.txt");
        System.out.println(arquivo2);
        System.out.println(arquivo2.getAbsolutePath());
        System.out.println(arquivo2.getAbsoluteFile());
        System.out.println();

        File arquivo3 = new File("../docs/contrato.txt");
        System.out.println(arquivo3);
        // caminho absoluto: desde o diretório raiz do SO (Sistema Operacional) até um arquivo ou pasta
        System.out.println(arquivo3.getAbsoluteFile());

        // caminho canônico: resolve todo o caminho absoluto a partir de um caminho relativo
        System.out.println(arquivo3.getCanonicalFile());






    }
}
