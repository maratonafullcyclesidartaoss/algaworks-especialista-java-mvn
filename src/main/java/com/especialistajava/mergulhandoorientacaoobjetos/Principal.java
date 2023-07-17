package com.especialistajava.mergulhandoorientacaoobjetos;

public class Principal {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Sidarta Silva";
        eu.cpf = "689.471.950-06";
        eu.anoNascimento = 1977;

        Pessoa voce = new Pessoa();
        voce.nome = "Maria Silva";
        voce.cpf = "176.070.250-14";
        voce.anoNascimento = 1999;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 120000;
        meuCarro.proprietario = eu;

        meuCarro.imprimirResumoDepreciacao();
        meuCarro.imprimirIpva();

/*        meuCarro.proprietario = new Pessoa();
        meuCarro.proprietario.nome = "Sidarta Silva";
        meuCarro.proprietario.cpf = "";
        meuCarro.proprietario.anoNascimento = 1977;*/

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = voce;

        seuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirIpva();

        System.out.println("Meu carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);

        System.out.println();

        System.out.println("Seu carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
    }
}