package com.especialistajava.classesaninhadas.estaticas;

import com.especialistajava.classesaninhadas.estaticas.email.servico.ServicoEmail;

public class Principal {

    public static void main(String[] args) {
        ServicoEmail servico = new ServicoEmail();
        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem(
            "joe@doe.com",
            "marie@marie.com",
            "Olá, tudo bem?");

        servico.enviar(mensagem);
    }
}
