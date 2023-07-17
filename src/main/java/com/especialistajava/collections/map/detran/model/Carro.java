package com.especialistajava.collections.map.detran.model;

import java.util.Comparator;
import java.util.Objects;

public class Carro implements Comparable<Carro> {

    private final String placa;
    private final String modelo;

    public Carro(String placa, String modelo) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("A placa deve ser informada.");
        }
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo deve ser informado.");
        }
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
            "placa='" + placa + '\'' +
            ", modelo='" + modelo + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(placa, carro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public int compareTo(Carro o) {
        return getPlaca().compareTo(o.getPlaca());
    }
}
