package com.especialistajava.encapsulamentojavabeanserecords;

import java.util.Objects;

public class AgendamentoComHorarioRecord {

    private HorarioRecord horario;
    private String descricao;

    public AgendamentoComHorarioRecord(HorarioRecord horario, String descricao) {
        Objects.requireNonNull(horario);
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe a descrição.");
        }
        this.horario = horario;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setHorario(HorarioRecord horario) {
        this.horario = horario;
    }

    public HorarioRecord getHorario() {
        return horario;
    }

    public String informarHorarioFormatado() {
        return horario.formatar();
    }
}
