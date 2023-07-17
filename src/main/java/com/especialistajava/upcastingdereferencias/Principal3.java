package com.especialistajava.upcastingdereferencias;

import com.especialistajava.upcastingdereferencias.banco.*;

public class Principal3 {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        Titular titular1 = new Titular("João da Silva", "060.995.690-65");
        ContaEspecial conta1 = new ContaEspecial(titular1, 1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);

        Titular titular2 = new Titular("Maria da Silva", "135.851.060-13");
        ContaEspecial conta2 = new ContaEspecial(titular2, 2222, 888888, 90);

        Titular titular3 = new Titular("José da Silva", "981.226.490-68");
        ContaSalario conta3 = new ContaSalario(titular3, 3333, 777777, 18_000);

        conta3.depositar(300);

        caixaEletronico.transferir(conta1, conta3, 50);
        conta1.imprimirDemonstrativo();
//        conta2.imprimirDemonstrativo();
        conta3.imprimirDemonstrativo();
    }
}
