package com.especialistajava.mergulhandoorientacaoobjetos;

public class PrincipalImc {

    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();

        Paciente paciente = new Paciente();
        paciente.altura = 1.72;
        paciente.peso = 88;

        IndiceMassaCorporal imc = calculadoraImc.calcular(paciente);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura %.2f e peso de %.2f está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}