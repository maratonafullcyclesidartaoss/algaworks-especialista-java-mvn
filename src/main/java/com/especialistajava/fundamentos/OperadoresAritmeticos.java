package com.especialistajava.fundamentos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int minhaIdade = 22;
        int suaIdade = 25;

        // Adição
        int totalIdades = minhaIdade + suaIdade + 100;
        System.out.println("Soma das idades: " + totalIdades);

        // Subtração
        int diferencaIdades = minhaIdade - suaIdade;
        System.out.println("Diferença das idades: " + diferencaIdades);

        // Multiplicação
        int dobroDaIdade = 2 * suaIdade;
        System.out.println("Dobro da sua idade: " + dobroDaIdade);

        // Divisão
        int metadeDaIdade = suaIdade / 2;
        System.out.println("Metade da sua idade: " + metadeDaIdade);

        // Módulo
        int restoDaIdade = suaIdade % 2;
        System.out.println("Resto da sua idade: " + restoDaIdade);
    }
}