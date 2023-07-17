package com.especialistajava.collections.set.contato;

import java.util.LinkedHashSet;
import java.util.Set;

public class Principal4 {

    public static void main(String[] args) {
        Set<Contato> contatos = new LinkedHashSet<>();

        System.out.println("-----");
        contatos.add(new Contato("Maria", "maria@maria.com", 18));
        contatos.add(new Contato("Ana", "ana@ana.com", 28));
        contatos.add(new Contato("José", "jose@jose.com", 38));
        contatos.add(new Contato("Rosa", "rosa@rosa.com", 48));
        contatos.add(new Contato("João", "joao@joao.com", 58));

        System.out.println("-----");

        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
