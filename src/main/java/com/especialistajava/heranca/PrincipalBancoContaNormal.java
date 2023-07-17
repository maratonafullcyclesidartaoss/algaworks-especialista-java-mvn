package com.especialistajava.heranca;

import com.especialistajava.heranca.banco.Conta;
import com.especialistajava.heranca.banco.ContaNormal;
import com.especialistajava.heranca.banco.Titular;

public class PrincipalBancoContaNormal {

    public static void main(String[] args) {
        Titular titular = new Titular("Joao da Sila", "016.196.120-70");
        ContaNormal conta = new ContaNormal(titular,
            1234, 999999);

        conta.imprimirDemonstrativo();
        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.sacar(27.5);
        conta.imprimirDemonstrativo();
    }
}