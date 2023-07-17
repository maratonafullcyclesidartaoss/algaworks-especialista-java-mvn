package com.especialistajava.collections.map.cidade;

import java.util.Objects;

public class Estado implements Comparable<Estado> {

    private final String sigla;
    private final String nome;

    public Estado(String sigla, String nome) {
        if (sigla == null || sigla.trim().isEmpty()) {
            throw new IllegalArgumentException("A sigla do estado deve ser informada.");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do estado deve ser informado.");
        }
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(sigla, estado.sigla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigla);
    }

    @Override
    public String toString() {
        return "Estado{" +
            "sigla='" + sigla + '\'' +
            ", nome='" + nome + '\'' +
            '}';
    }

    @Override
    public int compareTo(Estado o) {
        return getSigla().compareTo(o.getSigla());
    }
}
