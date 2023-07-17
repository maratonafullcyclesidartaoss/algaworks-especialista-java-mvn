package com.especialistajava.polimorfismoeclassesabstratas;

public class Principal {

    public static void main(String[] args) {
        GestorDeImpostos gestorImpostos = new GestorDeImpostos();

        Pessoa joao = new PessoaFisica("João da Silva", 45_000);
        Pessoa maria = new PessoaFisica("Maria da Silva", 180_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);

        System.out.printf("Valor total impostos: R$ %.2f%n", gestorImpostos.getValorTotalImpostos());

    }
}
