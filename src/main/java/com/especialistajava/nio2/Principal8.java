package com.especialistajava.nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Principal8 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path pastaDocs = Path.of(RELATIVE_PATH, "docs");
//        Files.delete(pastaDocs);

        Files.walkFileTree(pastaDocs, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.printf("Excluindo arquivo %s%n", file);
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }

//            @Override
//            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
//                System.out.printf("Excluindo diretório %s%n", dir);
//                return FileVisitResult.CONTINUE;
//            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                System.out.printf("Excluindo diretório %s%n", dir);
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }
        });

    }
}
