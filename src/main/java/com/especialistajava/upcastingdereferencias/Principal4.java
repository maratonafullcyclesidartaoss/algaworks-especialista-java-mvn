package com.especialistajava.upcastingdereferencias;

import com.especialistajava.upcastingdereferencias.banco.*;

public class Principal4 {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

//        Titular titular = new Titular("João da Silva", "724.385.060-08");
//        ContaEspecial contaEspecial = new ContaEspecial(titular,
//            1234, 999999, 90);
//
//        contaEspecial.setLimiteChequeEspecial(1000);
//
//        caixaEletronico.imprimirDemonstrativo(contaEspecial);

        Titular titular = new Titular("João da Silva", "724.385.060-08");
        ContaSalario contaSalario = new ContaSalario(titular,
            1234, 999999, 18_000);

        contaSalario.depositar(100);
        caixaEletronico.imprimirDemonstrativo(contaSalario);

        Titular titular1 = new Titular("Maria da Silva", "590.499.970-40");
        ContaInvestimento contaInvestimento = new ContaInvestimento(titular1,
                3333, 888888);

        contaInvestimento.depositar(100);
        contaInvestimento.creditarRendimentos(6);
        caixaEletronico.imprimirDemonstrativo(contaInvestimento);
    }
}
