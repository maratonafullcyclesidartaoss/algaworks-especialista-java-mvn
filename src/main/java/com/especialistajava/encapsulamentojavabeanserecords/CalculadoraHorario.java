package com.especialistajava.encapsulamentojavabeanserecords;

public class CalculadoraHorario {

    private CalculadoraHorario() {
    }

    public static HorarioImutavel somarDuasHoras(HorarioImutavel horario) {
        int hora = horario.getHora() + 2;

        if (hora > 24) {
            hora = hora - 24;
        }

//        horario.setHora(hora);
//        return horario;
        return new HorarioImutavel(hora, horario.getMinuto());
    }
}