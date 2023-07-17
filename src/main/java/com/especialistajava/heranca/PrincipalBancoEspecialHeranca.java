package com.especialistajava.heranca;

import com.especialistajava.heranca.banco.ContaEspecial;
import com.especialistajava.heranca.banco.ContaEspecialHeranca;
import com.especialistajava.heranca.banco.Titular;

public class PrincipalBancoEspecialHeranca {

    public static void main(String[] args) {
        Titular titular = new Titular("Joao da Sila", "016.196.120-70");
        ContaEspecialHeranca conta = new ContaEspecialHeranca(titular,
            1234, 999999, 90);
        conta.setLimiteChequeEspecial(1000);

        conta.imprimirDemonstrativo();
        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.sacar(200);
        conta.imprimirDemonstrativo();

        conta.debitarTarifaMensal();
        conta.imprimirDemonstrativo();

        System.out.println("\n"+ conta);
    }
}