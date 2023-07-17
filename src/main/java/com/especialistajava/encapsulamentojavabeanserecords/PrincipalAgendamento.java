package com.especialistajava.encapsulamentojavabeanserecords;

public class PrincipalAgendamento {

    public static void main(String[] args) {
        HorarioMutavel horario = new HorarioMutavel(10, 30);
        AgendamentoComCopiaDefensiva agendamentoCabelo = new AgendamentoComCopiaDefensiva(horario, "Corte de cabelo");
        agendamentoCabelo.getHorario().setHora(20);
//        horario.setHora(11);
//        horario.setMinuto(45);
        AgendamentoComCopiaDefensiva agendamentoBarba = new AgendamentoComCopiaDefensiva(horario, "Feitio de barba");

        imprimir(agendamentoCabelo);
        imprimir(agendamentoBarba);
    }

    private static void imprimir(AgendamentoComCopiaDefensiva agendamento) {
        System.out.printf("%s às %s", agendamento.getDescricao(), agendamento.obterHorarioFormatado());
    }
}