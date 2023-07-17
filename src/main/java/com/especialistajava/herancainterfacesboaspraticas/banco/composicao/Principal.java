package com.especialistajava.herancainterfacesboaspraticas.banco.composicao;

import com.especialistajava.herancainterfacesboaspraticas.banco.modelo.Conta;
import com.especialistajava.herancainterfacesboaspraticas.banco.modelo.ContaCorrente;

public class Principal {

    public static void main(String[] args) {
        PontuacaoDecorator pontuacao = new PontuacaoDecorator(new ContaCorrente());
        Conta conta1 = new TributacaoDecorator(pontuacao);
        Conta conta2 = new ContaCorrente();

        conta1.depositar(1_000);
        conta1.sacar(1_00);
        conta1.transferir(conta2, 1_00);

        System.out.printf("Saldo da conta 1: R$ %.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: R$ %.2f%n", conta2.getSaldo());
        System.out.printf("Pontos da conta 1: %d%n", pontuacao.getPontos());
    }
}
