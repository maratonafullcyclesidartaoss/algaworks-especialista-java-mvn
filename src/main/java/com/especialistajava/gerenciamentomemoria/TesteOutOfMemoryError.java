package com.especialistajava.gerenciamentomemoria;

import java.util.ArrayList;
import java.util.List;

public class TesteOutOfMemoryError {

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        while (true) {
            imprimirUsoMemoria();
            clientes.add(new Cliente());
        }
    }

    static void imprimirUsoMemoria() {
        System.out.printf("Máxima (Limite máximo memória Heap (25 por cento memória do SO)): %s%n",
            converterEmMegabytes(Runtime.getRuntime().maxMemory()));

        System.out.printf("Total empenhada (reservado pela JVM): %s%n",
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