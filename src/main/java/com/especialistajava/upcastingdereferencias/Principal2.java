package com.especialistajava.upcastingdereferencias;

import com.especialistajava.upcastingdereferencias.banco.ContaInvestimento;
import com.especialistajava.upcastingdereferencias.banco.ContaNormal;
import com.especialistajava.upcastingdereferencias.banco.ContaSalario;
import com.especialistajava.upcastingdereferencias.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "060.995.690-65");
        ContaNormal contaNormal = new ContaSalario(titular, 1234, 999999, 18_000);

    }
}
