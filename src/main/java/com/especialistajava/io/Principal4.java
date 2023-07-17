package com.especialistajava.io;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class Principal4 {

    public static void main(String[] args) throws IOException {
        File pasta1 = new File("src/main/java/com/especialistajava/io/documentos");
        File arquivo1 = new File(pasta1, "contrato.txt"); //.getCanonicalFile();

        System.out.printf("Nome: %s%n", arquivo1.getName());
        // Qual é o diretório pai?
        System.out.printf("Diretório pai: %s%n", arquivo1.getParent());

        // Arquivo ou diretório?
        System.out.printf("Arquivo %b%n", arquivo1.isFile());
        System.out.printf("Pasta %b%n", arquivo1.isDirectory());

        // Arquivo existe?
        System.out.printf("Existe: %b%n", arquivo1.exists());
        // Arquivo oculto
        System.out.printf("Oculto: %b%n", arquivo1.isHidden());

        // Data da última modificação do arquivo?
        System.out.printf("Última modificação: %s%n",
            Instant.ofEpochMilli(arquivo1.lastModified()));

        // Qual o tamanho de um arquivo?
        System.out.printf("Tamanho: %d%n", arquivo1.length());

        // Permissões do arquivo? Tem permissão de executar?
        System.out.printf("Pode executar: %b%n", arquivo1.canExecute());


        // Permissões do arquivo? Tem permissão de ler?
        System.out.printf("Pode ler: %b%n", arquivo1.canRead());

        // Permissões do arquivo? Tem permissão de escrever?
        System.out.printf("Pode escrever: %b%n", arquivo1.canWrite());

    }
}
