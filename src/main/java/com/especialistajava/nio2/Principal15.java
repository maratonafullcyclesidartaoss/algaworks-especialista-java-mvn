package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Principal15 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path path = Path.of(RELATIVE_PATH, "docs", "poema.txt");
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        try (ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.READ)) {
            channel.read(buffer);
            buffer.flip();
            System.out.println(buffer.position());
            System.out.println(buffer.limit());

            CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
            System.out.print(charBuffer);
        }

    }
}
