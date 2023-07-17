package com.especialistajava.heranca;

import com.especialistajava.heranca.banco.Conta;
import com.especialistajava.heranca.banco.ContaNormal;
import com.especialistajava.heranca.banco.Titular;

public class PrincipalObjectEquals {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "399.365.290-81");
        ContaNormal conta1 = new ContaNormal(titular, 1234, 999999);
        ContaNormal conta2 = new ContaNormal(titular, 1234, 999999);
        ContaNormal conta3 = new ContaNormal(titular, 1234, 999999);

//        System.out.println("== " + (conta1 == conta2));
        System.out.println("equals " + conta1.equals(conta1));
    }
}
