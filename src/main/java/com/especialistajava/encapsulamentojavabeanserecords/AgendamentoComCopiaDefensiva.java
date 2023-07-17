package com.especialistajava.encapsulamentojavabeanserecords;

import java.util.Objects;

public class AgendamentoComCopiaDefensiva {

    private final HorarioMutavel horario;
    private String descricao;

    public AgendamentoComCopiaDefensiva(HorarioMutavel horario, String descricao) {
        Objects.requireNonNull(horario);
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe a descrição.");
        }
        this.horario = new HorarioMutavel(horario.getHora(), horario.getMinuto());
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public HorarioMutavel getHorario() {
//        return horario;
        return new HorarioMutavel(horario.getHora(), horario.getMinuto());
    }

    public String obterHorarioFormatado() {
        return horario.formatar();
    }
}