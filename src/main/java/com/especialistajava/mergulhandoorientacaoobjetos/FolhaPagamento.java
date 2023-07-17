package com.especialistajava.mergulhandoorientacaoobjetos;

public class FolhaPagamento {

    Holerite calcularSalario(int quantidadeHorasNormais, int quantidadeHorasExtras, ContratoTrabalho contratoTrabalho) {
        Holerite holerite = new Holerite();
        holerite.valorTotalHorasNormais = quantidadeHorasNormais * contratoTrabalho.valorHoraNormal;
        holerite.valorTotalHorasExtras = quantidadeHorasExtras * contratoTrabalho.valorHoraExtra;
        if (contratoTrabalho.possuiAdicionalParaFilhos()) {
            double valorTotalSalario = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;
            holerite.valorAdicionalFilhos = valorTotalSalario * 0.1;
        }
        holerite.funcionario = contratoTrabalho.funcionario;
        return holerite;
    }
}