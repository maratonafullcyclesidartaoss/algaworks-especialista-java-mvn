package com.especialistajava.lancandoexcecoes;

public class Principal3 {

    public static void main(String[] args) {
        int idade = 17;

        try {
            if (idade < 18) {
                throw new IllegalArgumentException("Menor de idade");
            }
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
    }
}
