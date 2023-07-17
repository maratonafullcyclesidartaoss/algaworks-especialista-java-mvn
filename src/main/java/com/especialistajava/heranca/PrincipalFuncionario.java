package com.especialistajava.heranca;

public class PrincipalFuncionario {

    public static void main(String[] args) {
        Funcionario analista = new Funcionario("João", 39.3);
        int horasDia = 8;
        int diasMes = 21;
        int horasTrabalhadas = horasDia * diasMes;
        Holerite holerite = analista.gerarHolerite(horasTrabalhadas, "Jun/2023");
        holerite.imprimir();
        System.out.printf("Analista: %s", analista);
    }
}
