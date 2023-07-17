package com.especialistajava.collections.comercial;

import java.util.Objects;

public class Cliente {

    private String nome;
    private double limiteCompras;

    public Cliente(String nome, double limiteCompras) {
        setNome(nome);
        setLimiteCompras(limiteCompras);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do cliente deve ser informado.");
        }
        this.nome = nome;
    }

    public double getLimiteCompras() {
        return limiteCompras;
    }

    public void setLimiteCompras(double limiteCompras) {
        if (limiteCompras < 0) {
            throw new IllegalArgumentException("O limite de compras não deve ser negativo.");
        }
        this.limiteCompras = limiteCompras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Cliente{" +
            "nome='" + nome + '\'' +
            ", limiteCompras=" + limiteCompras +
            '}';
    }
}
