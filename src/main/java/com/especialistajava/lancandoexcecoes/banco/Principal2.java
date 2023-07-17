package com.especialistajava.lancandoexcecoes.banco;

import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) throws ContaInativaException {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente("123");
        ContaCorrente conta2 = new ContaCorrente("987");
        conta1.ativar();
        conta1.depositar(1_000);
        do {
            try {

                System.out.print("Valor para transferir: ");
                double valor = scanner.nextDouble();

                movimentar(conta1, conta2, valor);

                System.out.println("Deposito realizado com sucesso.");
                System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
                System.out.printf("Saldo da conta 2: %.2f%n", conta2.getSaldo());

                break;
            } catch (IllegalArgumentException iae) {
                System.out.println("Erro na movimentação da conta corrente: " + iae.getMessage());
            } catch (ContaInativaException ccie) {
                System.out.print("Conta inativa. Deseja ativar? ");
                boolean desejaAtivar = scanner.nextBoolean();
                if (desejaAtivar) {
                    conta1.ativar();
                    System.out.println("Ok. Conta corrente foi ativada.");
                } else {
                    System.out.println("O depósito não pode ser realizado, porque a conta permanece inativa.");
                    break;
                }
            } catch (ContaDestinoInativaException cdie) {
                System.out.print("Conta destino inativa. Deseja ativar? ");
                boolean desejaAtivar = scanner.nextBoolean();
                if (desejaAtivar) {
                    conta2.ativar();
                    System.out.println("Ok. Conta destino foi ativada.");
                } else {
                    System.out.println("O depósito não pode ser realizado, porque a conta destino permanece inativa.");
                    break;
                }
            } catch (SaldoInsuficienteException sie) {
                System.out.printf("Erro ao sacar: %s Saldo atual: %.2f. Valor saque: %.2f.%n",
                    sie.getMessage(), sie.getSaldoAtual(), sie.getValorSaque());
            }
        } while (true);
    }

    private static void movimentar(
        ContaCorrente conta1, ContaCorrente conta2, double valor)
        throws ContaInativaException, ContaDestinoInativaException, SaldoInsuficienteException {
        conta1.transferir(conta2, valor);
    }
}
