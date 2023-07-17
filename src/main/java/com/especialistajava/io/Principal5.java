package com.especialistajava.io;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class Principal5 {

    public static void main(String[] args) throws IOException {
        File pasta = new File("src/main/java/com/especialistajava/io/docs")
            .getCanonicalFile();

//        File[] arquivosOuPastas = pasta.listFiles();
//
//        if (arquivosOuPastas != null) {
//            for (File arquivoOuPasta : arquivosOuPastas) {
//                System.out.println(arquivoOuPasta.getName());
//            }
//        }

//        // filtrar apenas por arquivos
//        File[] arquivosOuPastas = pasta.listFiles(File::isFile);
//
//        if (arquivosOuPastas != null) {
//            for (File arquivoOuPasta : arquivosOuPastas) {
//                System.out.println(arquivoOuPasta.getName());
//            }
//        }

        // filtrar apenas por pastas
//        File[] arquivosOuPastas = pasta.listFiles(File::isDirectory);
//
//        if (arquivosOuPastas != null) {
//            for (File arquivoOuPasta : arquivosOuPastas) {
//                System.out.println(arquivoOuPasta.getName());
//            }
//        }

        // filtrar arquivos ou pastas pelo nome
        File[] arquivosOuPastas = pasta.listFiles((dir, nome) -> nome.startsWith("c"));

        if (arquivosOuPastas != null) {
            for (File arquivoOuPasta : arquivosOuPastas) {
                System.out.println(arquivoOuPasta.getName());
            }
        }

    }
}
