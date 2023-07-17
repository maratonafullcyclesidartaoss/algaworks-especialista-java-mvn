package com.especialistajava.strings.examples.transformacao;

public class Replace {

    public static void main(String[] args) {
        String nome = "Pedro da Silva da Costa da Oliveira";

        System.out.println(nome.replace('a', '@'));
        System.out.println(nome.replace(" da ", " "));
    }
}
