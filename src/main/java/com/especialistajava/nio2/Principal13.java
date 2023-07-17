package com.especialistajava.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Arrays;

public class Principal13 {

    private static final String RELATIVE_PATH =
        "src/main/java/com/especialistajava/nio2";

    public static void main(String[] args) throws IOException {
        // char buffer alocar caracters e não bytes apenas
        CharBuffer charBuffer = CharBuffer.allocate(1000);
        charBuffer.put('O');
        charBuffer.put('l');
        charBuffer.put('á');

        charBuffer.flip();

        charBuffer.chars()
            .forEach(c -> System.out.print((char) c));

        System.out.println(charBuffer);

//        System.out.println(Arrays.toString(charBuffer.array()));
    }
}
