package com.especialistajava.collections.map.cidade;

import java.util.Objects;

public class Cidade implements Comparable<Cidade> {

    private int codigoIbge;
    private String nome;
    private int totalHabitantes;

    public Cidade(int codigoIbge, String nome, int totalHabitantes) {
        setCodigoIbge(codigoIbge);
        setNome(nome);
        setTotalHabitantes(totalHabitantes);
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(int codigoIbge) {
        if (codigoIbge < 0) {
            throw new IllegalArgumentException("O código do IBGE informado não deve ser negativo.");
        }
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da cidade deve ser informado.");
        }
        this.nome = nome;
    }

    public int getTotalHabitantes() {
        return totalHabitantes;
    }

    public void setTotalHabitantes(int totalHabitantes) {
        if (totalHabitantes < 0) {
            throw new IllegalArgumentException("O total de habitantes informado não deve ser negativo.");
        }
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
