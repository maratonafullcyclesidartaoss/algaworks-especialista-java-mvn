package com.especialistajava.strings.examples.stringbuilder;

public class Principal {

    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();

//        String texto = "";
        StringBuilder sb = new StringBuilder(210_000);

        for (int i = 0; i < 200_000; i++) {
//            texto += "#";
            sb.append("#");
        }

//        System.out.println(texto);
        System.out.println(sb.toString());

        long duration = System.currentTimeMillis() - initialTime;
        System.out.printf("Duration: %.2f s%n", duration / 1_000d);
    }
}
