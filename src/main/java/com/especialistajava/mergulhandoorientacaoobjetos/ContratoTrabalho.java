package com.especialistajava.mergulhandoorientacaoobjetos;

public class ContratoTrabalho {

    double valorHoraNormal;
    double valorHoraExtra;
    Funcionario funcionario;

    boolean possuiAdicionalParaFilhos() {
        return this.funcionario.possuiFilhos();
    }
}