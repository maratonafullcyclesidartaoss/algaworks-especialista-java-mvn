package com.especialistajava.encapsulamentojavabeanserecords;

public class PrincipalCalculadoraHorarioRecord {

    public static void main(String[] args) {
        HorarioRecord horario = new HorarioRecord(10, 30);
        AgendamentoComHorarioRecord agendamentoCabelo = new AgendamentoComHorarioRecord(horario, "Corte de cabelo");

        HorarioRecord novoHorario = CalculadoraHorarioRecord.somarDuasHoras(horario);

        agendamentoCabelo.setHorario(new HorarioRecord(16, 20));

        System.out.println(agendamentoCabelo.informarHorarioFormatado());
        System.out.println(novoHorario.formatar());
    }
}