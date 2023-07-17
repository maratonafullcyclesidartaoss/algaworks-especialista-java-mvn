package com.especialistajava.upcastingdereferencias.banco;

public class ContaNormal {

    private int agencia;
    private int numero;
    private double saldo;
    private Titular titular;

    public ContaNormal(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public boolean possuiGratuidadeImpressao() {
        return false;
    }

    protected void validarSaldoParaSaque(double valorSaque) {
        if (getSaldo() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque.");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior do que 0.");
        }
        this.validarSaldoParaSaque(valorSaque);
        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior do que 0.");
        }
        saldo += valorDeposito;
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", titular.getNome());
        System.out.printf("Saldo: R$ %.2f%n", getSaldo());
        System.out.println();
    }

    @Override
    public String toString() {
        return "ContaNormal{" +
            "agencia=" + agencia +
            ", numero=" + numero +
            ", titular=" + titular +
            '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ContaNormal contaNormal = (ContaNormal) obj;
        if (this.agencia != contaNormal.agencia) return false;
        if (this.numero != contaNormal.numero) return false;
        return true;
    }
}