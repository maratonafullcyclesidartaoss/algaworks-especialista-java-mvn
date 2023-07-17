package com.especialistajava.trabalhandocomarrays;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    List<ItemCardapio> itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
        this.itens.add(item);
    }

    void removerItem(int indice) {
        this.itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : this.itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                System.out.printf("%s R$ %.2f%n", item.descricao, item.preco);
            }
        }
    }

    List<ItemCardapio> consultarItensPorPreco(double precoMinimo, double precoMaximo) {
        List<ItemCardapio> itensEncontrados = new ArrayList<>();
        for (ItemCardapio item : this.itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                itensEncontrados.add(item);
            }
        }
        return itensEncontrados;
    }
}