package com.especialistajava.lancandoexcecoes.banco;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente("123");

        do {
            try {
                System.out.print("Valor para depositar: ");
                double valor = scanner.nextDouble();

                depositar(conta1, valor);

                System.out.println("Deposito realizado com sucesso.");
                System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());

                break;
            } catch (IllegalArgumentException iae) {
                System.out.println("Erro na movimentação da conta corrente: " + iae.getMessage());
            } catch (ContaInativaException ccie) {
                System.out.print("Verificamos que a conta está inativa. Deseja ativar? ");
                boolean ativarConta = scanner.nextBoolean();
                if (ativarConta) {
                    conta1.ativar();
                    System.out.println("Ok. Conta corrente foi ativada.");
                } else {
                    System.out.println("O depósito não pode ser realizado, porque a conta permanece inativa.");
                    break;
                }
            }
        } while (true);

    }

    private static void depositar(ContaCorrente conta, double valor) throws ContaInativaException {
        conta.depositar(valor);
    }
}
