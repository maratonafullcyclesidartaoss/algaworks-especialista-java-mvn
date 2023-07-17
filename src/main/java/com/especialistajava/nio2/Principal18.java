package com.especialistajava.nio2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.*;

public class Principal18 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path path = Path.of(RELATIVE_PATH, "docs", "poema.txt");

        try (BufferedReader leitor = Files.newBufferedReader(path)) {
            leitor.lines()
                .forEach(System.out::println);
        }

//        ByteBuffer buffer = ByteBuffer.allocate(40); // 40 bytes
//        try (var inputStream = new FileInputStream(path.toFile());
//            var channel = inputStream.getChannel()) {
//            while (channel.read(buffer) > 0) {
//                buffer.flip();
//                CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
//                System.out.print(charBuffer);
//                buffer.clear();
//            }
//        }


    }
}
