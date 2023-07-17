package com.especialistajava.fundamentos;

public class CalculadoraMediaIdade {

    public static void main(String[] args) {
        int minhaIdade = 22;
        int suaIdade = 25;
        int idadeMaria = 19;

        int idadeMedia = (minhaIdade + suaIdade + idadeMaria) / 3;
        System.out.println("Média das idades: " + idadeMedia);
    }
}