package com.especialistajava.encapsulamentojavabeanserecords;

public class PrincipalCalculadoraHorario {

    public static void main(String[] args) {
        HorarioImutavel horario = new HorarioImutavel(10, 30);
        AgendamentoComHorarioImutavel agendamentoCabelo = new AgendamentoComHorarioImutavel(horario, "Corte de cabelo");

        HorarioImutavel novoHorario = CalculadoraHorario.somarDuasHoras(horario);

        agendamentoCabelo.setHorario(new HorarioImutavel(16, 20));

        System.out.println(agendamentoCabelo.informarHorarioFormatado());
        System.out.println(novoHorario.formatar());
    }
}