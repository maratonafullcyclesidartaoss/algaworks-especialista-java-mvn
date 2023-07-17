package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Principal14 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // Olá
//         System.out.println(Arrays.toString("Olá".getBytes(StandardCharsets.UTF_8)));

        buffer.put((byte) 79);
        buffer.put((byte) 108);
        buffer.put((byte) -61);
        buffer.put((byte) -95);

        buffer.flip();
        System.out.println(buffer.limit());

//        CharBuffer charBuffer = buffer.asCharBuffer();

        Charset charset = StandardCharsets.UTF_8;
        CharBuffer charBuffer = charset.decode(buffer);
        System.out.println(charBuffer);

        // converter byte buffer em um char buffer onde a gente trata de caracters

//        System.out.println(Arrays.toString("O".getBytes()));
//        System.out.println(Arrays.toString("á".getBytes()));

    }
}
