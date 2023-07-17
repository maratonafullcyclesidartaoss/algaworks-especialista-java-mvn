package com.especialistajava.heranca;

import com.especialistajava.heranca.banco.Conta;
import com.especialistajava.heranca.banco.Titular;

public class PrincipalBanco2 {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setTitular(new Titular("Joao da Sila", "016.196.120-70"));
        conta.setAgencia(1234);
        conta.setNumero(999999);
        conta.setTipo(Conta.INVESTIMENTO);

        conta.imprimirDemonstrativo();
        conta.depositar(100);
        conta.imprimirDemonstrativo();

//        conta.sacar(27.5);
//        conta.imprimirDemonstrativo();

        conta.creditarRendimentos(6);
        conta.imprimirDemonstrativo();
    }
}