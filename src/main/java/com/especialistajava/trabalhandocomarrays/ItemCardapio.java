package com.especialistajava.trabalhandocomarrays;

public class ItemCardapio {

    String descricao;
    double preco;

    boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
        return this.preco >= precoMinimo && this.preco <= precoMaximo;
    }
}