package com.especialistajava.heranca;

import com.especialistajava.heranca.banco.Conta;
import com.especialistajava.heranca.banco.ContaInvestimento;
import com.especialistajava.heranca.banco.Titular;

public class PrincipalBancoInvestimento {

    public static void main(String[] args) {
        ContaInvestimento conta = new ContaInvestimento();
        conta.setTitular(new Titular("Joao da Sila", "016.196.120-70"));
        conta.setAgencia(1234);
        conta.setNumero(999999);

        conta.imprimirDemonstrativo();
        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.creditarRendimentos(6);
        conta.imprimirDemonstrativo();
    }
}