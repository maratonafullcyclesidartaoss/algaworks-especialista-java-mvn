package com.especialistajava.encapsulamentojavabeanserecords;

import java.util.Objects;

public class AgendamentoComHorarioImutavel {

    private HorarioImutavel horario;
    private String descricao;

    public AgendamentoComHorarioImutavel(HorarioImutavel horario, String descricao) {
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

    public void setHorario(HorarioImutavel horario) {
        this.horario = horario;
    }

    public HorarioImutavel getHorario() {
        return horario;
    }

    public String informarHorarioFormatado() {
        return horario.formatar();
    }
}
