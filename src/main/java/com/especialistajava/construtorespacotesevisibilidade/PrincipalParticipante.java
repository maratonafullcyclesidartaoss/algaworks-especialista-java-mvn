package com.especialistajava.construtorespacotesevisibilidade;

public class PrincipalParticipante {

    public static void main(String[] args) {
//        Participante participante1 = new Participante("Joao", 99);
        Participante participante2 = new Participante("Maria");
        Participante participante3 = new Participante();

//        participante1.imprimirSaldoDePontos();
        participante2.imprimirSaldoDePontos();
        participante3.imprimirSaldoDePontos();
    }
}