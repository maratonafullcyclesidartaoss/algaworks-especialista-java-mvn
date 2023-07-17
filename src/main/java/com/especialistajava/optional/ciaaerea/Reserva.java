package com.especialistajava.optional.ciaaerea;

import java.util.Objects;

public class Reserva {

    private final String codigo;
    private final Voo voo;
    private final Passageiro passageiro;
    private int quantidadeBagagens;

    public Reserva(String codigo, Voo voo, String nomePassageiro) {
        Objects.requireNonNull(codigo);
        Objects.requireNonNull(voo);
        Objects.requireNonNull(nomePassageiro);
        if (codigo.isBlank()) {
            throw new IllegalArgumentException("Informe o código.");
        }
        if (nomePassageiro.isBlank()) {
            throw new IllegalArgumentException("Informe o nome do passageiro.");
        }
        this.codigo = codigo;
        this.voo = voo;
        this.passageiro = new Passageiro(nomePassageiro);
    }

    public String getCodigo() {
        return codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public int getQuantidadeBagagens() {
        return quantidadeBagagens;
    }

    public void adicionarBagagens(int quantidade) {
        this.quantidadeBagagens += quantidade;
    }

    @Override
    public String toString() {
        return "Reserva{" +
            "codigo='" + codigo + '\'' +
            ", voo=" + voo +
            ", passageiro=" + passageiro +
            ", quantidadeBagagens=" + quantidadeBagagens +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(codigo, reserva.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
