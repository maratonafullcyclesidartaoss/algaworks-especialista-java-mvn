package com.especialistajava.gerenciamentomemoria;

public class PrincipalMemoriaHeap {

    public static void main(String[] args) {
        imprimirUsoMemoria();

        byte[] x = new byte[500 * 1024 * 1024];

        imprimirUsoMemoria();

        x = null;

        System.gc();

        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria() {
        System.out.printf("Máxima (Limite máximo memória Heap (25% memória do SO)): %s%n",
            converterEmMegabytes(Runtime.getRuntime().maxMemory()));

        System.out.printf("Total empenhada (JVM): %s%n",
            converterEmMegabytes(Runtime.getRuntime().totalMemory()));

        System.out.printf("Disponível: %s%n",
            converterEmMegabytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory()
            - Runtime.getRuntime().freeMemory();

        System.out.printf("Usada: %s%n", converterEmMegabytes(memoriaUsada));

        System.out.println("--------------------");
    }

    static String converterEmMegabytes(long bytes) {
        return String.format("%.2fMB%n", bytes / 1024d / 1024d);
    }
}