package com.especialistajava.upcastingdereferencias;

import com.especialistajava.upcastingdereferencias.banco.ContaEspecial;
import com.especialistajava.upcastingdereferencias.banco.ContaNormal;
import com.especialistajava.upcastingdereferencias.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "060.995.690-65");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 99);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        ContaNormal contaNormal = contaEspecial;

        System.out.println(contaEspecial.getClass().getName());
        System.out.println(contaNormal.getClass().getName());

        System.out.println(contaEspecial == contaNormal);

//        ContaInvestimento contaInvestimento = (ContaInvestimento) contaEspecial;
    }
}
