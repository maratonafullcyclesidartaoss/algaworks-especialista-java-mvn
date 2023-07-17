package com.especialistajava.mergulhandoorientacaoobjetos;

public class Aeronave {

    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void reservarAssentos(int numeroAssentos) {
        if (ativo) {
            this.assentosReservados += numeroAssentos;
        } else {
            System.out.println("Aeronava desativada. Assentos não reservados.");
        }
    }

    void desativar() {
        this.ativo = false;
    }

    void ativar() {
        this.ativo = true;
    }
}