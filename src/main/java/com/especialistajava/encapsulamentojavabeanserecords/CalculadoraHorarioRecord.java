package com.especialistajava.encapsulamentojavabeanserecords;

public class CalculadoraHorarioRecord {

    private CalculadoraHorarioRecord() {
    }

    public static HorarioRecord somarDuasHoras(HorarioRecord horario) {
        int hora = horario.hora() + 2;

        if (hora > 24) {
            hora = hora - 24;
        }

//        horario.setHora(hora);
//        return horario;
        return new HorarioRecord(hora, horario.minuto());
    }
}