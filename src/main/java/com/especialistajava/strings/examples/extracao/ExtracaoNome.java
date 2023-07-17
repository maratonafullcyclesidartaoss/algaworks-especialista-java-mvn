package com.especialistajava.strings.examples.extracao;

public class ExtracaoNome {

    public static void main(String[] args) {
        String nome = "João Silva de Souza";

        // Extrair sobrenome: Silva Souza
//        System.out.println(nome.substring(5));

        // Dinamicamente
        int index = nome.indexOf(" ");
//        System.out.println(index);
//        System.out.println(nome.substring(index + 1));

        // Silva
//        System.out.println(nome.substring(index + 1, index + 6));
//
//        System.out.println(obterSobrenome(nome));

        System.out.println(obterSegundoNome(nome));
    }

    private static String obterSobrenome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");
        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo.");
        }
        return nome.substring(posicaoPrimeiroEspaco + 1);
    }

    private static String obterSegundoNome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");
        int posicaoSegundoEspaco = nome.indexOf(" ", posicaoPrimeiroEspaco + 1);

        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo.");
        }
        return nome.substring(posicaoPrimeiroEspaco + 1,
            posicaoSegundoEspaco < 0 ? nome.length() : posicaoSegundoEspaco);
    }
}
