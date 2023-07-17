package com.especialistajava.mergulhandoorientacaoobjetos;

public class TesteReferencias {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Joao";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = pessoa1;

        meuCarro.proprietario.nome = "Maria";
        System.out.println(pessoa1.nome);
    }
}