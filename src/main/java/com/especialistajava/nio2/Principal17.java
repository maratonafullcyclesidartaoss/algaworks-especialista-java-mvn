package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

import static java.nio.file.StandardOpenOption.*;

public class Principal17 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        Path path = Path.of(RELATIVE_PATH, "docs", "arquivo.txt");
        ByteBuffer buffer = ByteBuffer.allocate(1024); // 1KB
        // Olá
        buffer.put((byte) 79);
        buffer.put((byte) 108);
        buffer.put((byte) -61);
        buffer.put((byte) -95);

//        System.out.println(Arrays.toString(buffer.array()));

        try (ByteChannel channel = Files.newByteChannel(
            path, WRITE, CREATE, TRUNCATE_EXISTING)) {
            buffer.flip();
//            System.out.println(buffer.position());
//            System.out.println(buffer.limit());
            channel.write(buffer);
        }
    }
}
