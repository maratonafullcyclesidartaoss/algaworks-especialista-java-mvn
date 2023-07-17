package com.especialistajava.mergulhandoorientacaoobjetos;

public class TesteInicializacao {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.fabricante = "Honda";
        meuCarro.anoFabricacao = 2022;

        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.anoFabricacao);
        System.out.println(meuCarro.proprietario);
        System.out.println(meuCarro.proprietario.nome);
    }
}