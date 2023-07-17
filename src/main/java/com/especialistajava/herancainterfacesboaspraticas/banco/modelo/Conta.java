package com.especialistajava.herancainterfacesboaspraticas.banco.modelo;

public interface Conta {

    double getSaldo();

    void depositar(double valor);
    void sacar(double valor);
    void transferir(Conta destino, double valor);

    void aplicarEmInvestimento(double valor);
}
