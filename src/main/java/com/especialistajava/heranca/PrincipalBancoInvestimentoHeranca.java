package com.especialistajava.heranca;

import com.especialistajava.heranca.banco.ContaInvestimento;
import com.especialistajava.heranca.banco.ContaInvestimentoHeranca;
import com.especialistajava.heranca.banco.Titular;

public class PrincipalBancoInvestimentoHeranca {

    public static void main(String[] args) {
        Titular titular = new Titular("Joao da Sila", "016.196.120-70");
        ContaInvestimentoHeranca conta = new ContaInvestimentoHeranca(titular,
            1234, 999999);

        conta.imprimirDemonstrativo();
        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.creditarRendimentos(6);
        conta.imprimirDemonstrativo();
    }
}