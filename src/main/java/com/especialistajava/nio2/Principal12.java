package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.util.Arrays;

public class Principal12 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
//        Buffer buffer = ByteBuffer.allocate(1024);  // 1KB
        ByteBuffer buffer = ByteBuffer.allocate(1024);  // 1KB
//        System.out.println(buffer.position());

        System.out.println(buffer.limit());
        buffer.put((byte) 10);
        buffer.put((byte) 20);

        buffer.flip();
        buffer.clear();
        System.out.println(buffer.limit());

        buffer.put((byte) 30);
        buffer.put((byte) 40);

        buffer.put((byte) 50);

        System.out.println(Arrays.toString(buffer.array()));
    }
}
