package com.especialistajava.collections.set.contato;

public class Principal {

    public static void main(String[] args) {
        Contato contato1 = new Contato("Maria", "maria@maria.com", 18);
        Contato contato2 = new Contato("Ana", "ana@ana.com", 18);
        Contato contato3 = new Contato("José", "jose@jose.com", 28);
        Contato contato4 = new Contato("João", "joao@joao.com", 38);
        Contato contato5 = new Contato("João da Silva", "joaosilva@joaosilva.com", 48);

        System.out.println(contato1.hashCode());
        System.out.println(contato2.hashCode());
        System.out.println(contato3.hashCode());
        System.out.println(contato4.hashCode());
        System.out.println(contato5.hashCode());

        System.out.println(contato3.equals(contato4));
    }
}
