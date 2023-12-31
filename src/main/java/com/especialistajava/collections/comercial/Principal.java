package com.especialistajava.collections.comercial;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        ItemVenda mouse = new ItemVenda("Magic mouse", 700);
        ItemVenda adaptadorUsb = new ItemVenda("Adaptador USB", 400);
        ItemVenda macbook = new ItemVenda("Macbook Pro", 15_000);
        ItemVenda limpaTela = new ItemVenda("Limpa tela", 70);

        Cliente cliente = new Cliente("João da Silva", 2_000);
        Venda venda = new Venda(cliente);

//        List<ItemVenda> itens = new ArrayList<>();
//        itens.add(mouse);
//        itens.add(adaptadorUsb);
//        itens.add(macbook);

//        venda.setItens(itens);

        venda.adicionarItem(mouse);
        venda.adicionarItem(adaptadorUsb);
//        venda.adicionarItem(macbook);

        var itens = venda.getItens();
//        itens.add(macbook);

        List<ItemVenda> itensNaoModificaveis = venda.getItens();
        System.out.println(venda.getValorTotal());
        System.out.println(itensNaoModificaveis);
        System.out.println();
        venda.adicionarItem(limpaTela);
        System.out.println(venda.getValorTotal());
        System.out.println(itensNaoModificaveis);

//        System.out.println(venda.getValorTotal());
//        System.out.println(venda.getItens());
    }
}
