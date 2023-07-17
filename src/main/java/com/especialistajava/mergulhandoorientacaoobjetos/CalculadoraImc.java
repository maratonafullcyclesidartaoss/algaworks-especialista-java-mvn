package com.especialistajava.mergulhandoorientacaoobjetos;

public class CalculadoraImc {

    IndiceMassaCorporal calcular(Paciente paciente) {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;
        imc.medir();
        return imc;
    }

    void abrirInternacao() {

    }

    void prescreverMedicacao() {

    }

    void agendarConsulta() {

    }

    void agendarExameSangue() {

    }
}