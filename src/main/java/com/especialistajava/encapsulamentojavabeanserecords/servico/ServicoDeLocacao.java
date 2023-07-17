package com.especialistajava.encapsulamentojavabeanserecords.servico;

import com.especialistajava.encapsulamentojavabeanserecords.Locacao;

public class ServicoDeLocacao {

    public void confirmarLocacao(Locacao locacao) {
//        double totalDiarias = locacao.getVeiculo().getGrupo().getValorDiaria()
//            * locacao.getQuantidadeDiarias();

        double totalDiarias = locacao.calcularValorDiarias();

        locacao.reservar();
    }
}