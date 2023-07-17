package com.especialistajava.collections.linkedlist.agenciaviagem.model;

import java.util.Objects;

public class Hotel implements Comparable<Hotel> {

    private String nome;
    private String cidade;
    private double precoDiaria;

    public Hotel(String nome, String cidade, double precoDiaria) {
        setNome(nome);
        setCidade(cidade);
        setPrecoDiaria(precoDiaria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome deve ser informado.");
        }
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade == null || cidade.trim().isEmpty()) {
            throw new IllegalArgumentException("A cidade deve ser informada.");
        }
        this.cidade = cidade;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if (precoDiaria < 0) {
            throw new IllegalArgumentException("O preço informado da diária não deve ser negativo.");
        }
        this.precoDiaria = precoDiaria;
    }

    @Override
    public String toString() {
        return "Hotel{" +
            "nome='" + nome + '\'' +
            ", cidade='" + cidade + '\'' +
            ", precoDiaria=" + precoDiaria +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(nome, hotel.nome) && Objects.equals(cidade, hotel.cidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cidade);
    }

    @Override
    public int compareTo(Hotel o) {
//        if (this.getPrecoDiaria() < o.getPrecoDiaria()) {
//            return -1;
//        } else if (this.getPrecoDiaria() > o.getPrecoDiaria()) {
//            return 1;
//        }
//        return 0;
//        return Double.valueOf(getPrecoDiaria())
//            .compareTo(Double.valueOf(o.getPrecoDiaria()));
//        return Double.compare(getPrecoDiaria(), o.getPrecoDiaria());
        return getNome().compareTo(o.getNome());
    }
}
