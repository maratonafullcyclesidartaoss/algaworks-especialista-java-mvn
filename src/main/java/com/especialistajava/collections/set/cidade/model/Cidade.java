package com.especialistajava.collections.set.cidade.model;

import java.util.Objects;

public class Cidade implements Comparable<Cidade> {

    private int codigoIbge;
    private String nome;
    private int totalHabitantes;

    public Cidade(int codigoIbge, String nome, int totalHabitantes) {
        if (codigoIbge < 0) {
            throw new IllegalArgumentException("O código do IBGE informado não pode ser negativo.");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Deve ser informado o nome.");
        }
        if (totalHabitantes < 0) {
            throw new IllegalArgumentException("O total de habitantes não pode ser negativo.");
        }
        this.codigoIbge = codigoIbge;
        this.nome = nome;
        this.totalHabitantes = totalHabitantes;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(int codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalHabitantes() {
        return totalHabitantes;
    }

    public void setTotalHabitantes(int totalHabitantes) {
        this.totalHabitantes = totalHabitantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return codigoIbge == cidade.codigoIbge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoIbge);
    }

    @Override
    public String toString() {
        return "Cidade{" +
            "codigoIbge=" + codigoIbge +
            ", nome='" + nome + '\'' +
            ", totalHabitantes=" + totalHabitantes +
            '}';
    }

    @Override
    public int compareTo(Cidade o) {
        return Integer.compare(getCodigoIbge(), o.getCodigoIbge());
    }
}
