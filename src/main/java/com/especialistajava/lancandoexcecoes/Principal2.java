package com.especialistajava.lancandoexcecoes;

public class Principal2 {

    public static void main(String[] args) {
        try {
            System.out.println("Teste");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
