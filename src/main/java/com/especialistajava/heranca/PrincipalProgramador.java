package com.especialistajava.heranca;

public class PrincipalProgramador {

    public static void main(String[] args) {
        Programador programador = new Programador("Sidarta", 51.3);
        programador.setValorBonus(810.3);
        int horasDia = 8;
        int diasMes = 21;
        int horasTrabalhadas = horasDia * diasMes;
        Holerite holerite = programador.gerarHolerite(horasTrabalhadas, "Jun/2023");
        holerite.imprimir();
        System.out.printf("Programador: %s", programador);
    }
}
