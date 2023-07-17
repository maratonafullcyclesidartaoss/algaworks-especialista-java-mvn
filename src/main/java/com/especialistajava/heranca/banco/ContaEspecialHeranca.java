package com.especialistajava.heranca.banco;

public class ContaEspecialHeranca extends ContaInvestimentoHeranca {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecialHeranca(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponível: R$ %.2f%n", getSaldoDisponivel());
    }

    @Override
    protected void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque.");
        }
    }

    @Override
    public String toString() {
        return "ContaEspecialHeranca{" +
            "tarifaMensal=" + tarifaMensal +
            ", limiteChequeEspecial=" + limiteChequeEspecial +
            "} " + super.toString();
    }
}