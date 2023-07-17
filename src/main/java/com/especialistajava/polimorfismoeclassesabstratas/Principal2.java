package com.especialistajava.polimorfismoeclassesabstratas;

public class Principal2 {

    public static void main(String[] args) {
        GestorDeImpostos gestorImpostos = new GestorDeImpostos();

        Pessoa joao = new PessoaFisica("João da Silva", 45_000);
        Pessoa maria = new PessoaFisica("Maria da Silva", 180_000);

        Pessoa barDoZe = new EmpresaSimples("Bar do Zé", 250_000, 160_000);
        Pessoa codeConsultoria = new EmpresaLucroReal("Code Consultoria", 8_000_000, 6_000_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);
        gestorImpostos.adicionar(barDoZe);
        gestorImpostos.adicionar(codeConsultoria);

        System.out.printf("Valor total impostos: R$ %.2f%n", gestorImpostos.getValorTotalImpostos());

    }
}
