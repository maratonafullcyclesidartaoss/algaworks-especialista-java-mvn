package com.especialistajava.nio2;

import java.nio.file.Path;

public class Principal2 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    private static final String ABSOLUTE_PATH =
        "/home/sidarta/Downloads/algaworks-especialista-java-mvn/src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) {
        // Caminho absoluto: caminho completo desde a raiz a partir do sistema de arquivos
        Path arquivo = Path.of(ABSOLUTE_PATH, "docs", "contrato.txt");
        System.out.println("arquivo: " + arquivo);

        // Caminho relativo ao diretório base de trabalho
        Path arquivo2 = Path.of(RELATIVE_PATH, "docs", "contrato.txt");
        System.out.println("arquivo2: " + arquivo2);

        Path arquivoAbsoluto = arquivo2.toAbsolutePath();
        System.out.println("arquivoAbsoluto: " + arquivoAbsoluto);

        System.out.println("isAbsolute: " + arquivo2.isAbsolute());
        System.out.println("isAbsolute: " + arquivoAbsoluto.isAbsolute());

        Path arquivo3 = Path.of(RELATIVE_PATH, "../contrato.txt");
        Path arquivoAbsoluto3 = arquivo3.toAbsolutePath();
        System.out.println("arquivo3: " + arquivo3);
        System.out.println("arquivoAbsoluto3: " + arquivoAbsoluto3);


        Path arquivoNormalizado = arquivoAbsoluto3.normalize();
        System.out.println("arquivoNormalizado: " + arquivoNormalizado);
    }
}
