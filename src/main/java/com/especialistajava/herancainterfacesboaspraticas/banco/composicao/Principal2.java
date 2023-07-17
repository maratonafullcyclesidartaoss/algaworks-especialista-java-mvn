package com.especialistajava.herancainterfacesboaspraticas.banco.composicao;

import com.especialistajava.herancainterfacesboaspraticas.banco.modelo.ContaCorrente;

public class Principal2 {

    public static void main(String[] args) {
        AuditoriaDecorator conta1 = new AuditoriaDecorator(new ContaCorrente());

        conta1.depositar(1000);
        conta1.sacar(100);
        conta1.sacar(50);

        System.out.printf("Saldo da conta: R$ %.2f%n", conta1.getSaldo());
        System.out.printf("Operações: %d", conta1.getQuantidadeOperacoes());
    }
}
