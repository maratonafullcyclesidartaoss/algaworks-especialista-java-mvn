package com.especialistajava.strings.examples.transformacao;

public class Strip {

    public static void main(String[] args) {
        String nome = "\n     Pedro     ";

//        System.out.println(">"+nome+"<");
//        System.out.println("----------");
//        System.out.println(nome.strip());
//        System.out.println(nome.trim());
//        System.out.println(nome.stripLeading());
        System.out.println(nome.stripTrailing());
    }
}
