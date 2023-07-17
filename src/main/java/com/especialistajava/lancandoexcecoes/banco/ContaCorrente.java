package com.especialistajava.lancandoexcecoes.banco;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("Deve ser informado o número.");
        }
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !ativa;
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public boolean depositar(double valor) throws ContaInativaException {
        if (valor <= 0) {
//            System.out.println("Valor de depósito deve ser maior que 0.");
            throw new IllegalArgumentException("O valor de depósito não pode ser negativo ou zero.");
        }
        if (isInativa()) {
            throw new ContaInativaException("A conta corrente está inativa.");
        }

        this.saldo += valor;
        return true;
    }

    public void sacar(double valor) throws SaldoInsuficienteException, ContaInativaException{
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor para sacar não pode ser negativo ou 0.");
        }
        if (valor > getSaldo()) {
            throw new SaldoInsuficienteException("O valor para sacar é maior do que o saldo atual.", getSaldo(), valor);
        }
        if (isInativa()) {
            throw new ContaInativaException("A conta está inativa.");
        }

        this.saldo -= valor;
    }

    public void transferir(ContaCorrente contaDestino, double valor)
        throws ContaInativaException, ContaDestinoInativaException, SaldoInsuficienteException {
        if (contaDestino.isInativa()) {
            throw new ContaDestinoInativaException("Conta destino está inativa.");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
