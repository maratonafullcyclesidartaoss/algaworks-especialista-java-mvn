package com.especialistajava.encapsulamentojavabeanserecords;

public class PrincipalHorario {

    public static void main(String[] args) {
        HorarioMutavel horario = new HorarioMutavel(10, 55);
        System.out.println(horario.formatar());
    }
}