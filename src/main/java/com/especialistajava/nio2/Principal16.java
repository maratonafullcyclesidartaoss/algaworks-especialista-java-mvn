package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Principal16 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path path = Path.of(RELATIVE_PATH, "docs", "poema.txt");
        ByteBuffer buffer = ByteBuffer.allocate(3);

        try (ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.READ)) {
            while (channel.read(buffer) > 0) {

                buffer.flip();
//                System.out.println("\n" + buffer.position());

                CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
                System.out.print(charBuffer);

                buffer.clear();
//                System.out.println("\n" + buffer.position());
            }
        }

    }
}
