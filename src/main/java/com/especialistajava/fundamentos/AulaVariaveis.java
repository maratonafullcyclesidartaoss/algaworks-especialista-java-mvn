package com.especialistajava.fundamentos;

public class AulaVariaveis {

    public static void main(String[] args) {
        // não recomendado pela Code Conventions da Oracle
        // int minhaIdade = 21, suaIdade = 25;

        int minhaIdade = 21;
        minhaIdade = 22;
        int suaIdade = 25;

        int totalIdades = minhaIdade + suaIdade;

        System.out.println("Total das idades: " + totalIdades);
    }
}