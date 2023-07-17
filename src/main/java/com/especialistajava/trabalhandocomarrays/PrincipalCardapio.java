package com.especialistajava.trabalhandocomarrays;

import java.util.List;

public class PrincipalCardapio {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();

        ItemCardapio item1 = new ItemCardapio();
        item1.descricao = "Rib Eye 500g";
        item1.preco = 95;

        ItemCardapio item2 = new ItemCardapio();
        item2.descricao = "Picanha 400g";
        item2.preco = 102.5;

        ItemCardapio item3 = new ItemCardapio();
        item3.descricao = "Batata frita 300g";
        item3.preco = 12;

        cardapio.adicionarItem(item1);
        cardapio.adicionarItem(item2);
        cardapio.adicionarItem(item3);

        List<ItemCardapio> itensBaratos = cardapio.consultarItensPorPreco(0, 10);

        for (ItemCardapio item : itensBaratos) {
            System.out.printf("%s x R$ %.2f%n", item.descricao, item.preco);
        }
    }
}