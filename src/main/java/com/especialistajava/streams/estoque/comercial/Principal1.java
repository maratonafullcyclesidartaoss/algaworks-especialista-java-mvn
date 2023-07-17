package com.especialistajava.streams.estoque.comercial;

import com.especialistajava.streams.estoque.comercial.venda.ServicoDeVenda;
import com.especialistajava.streams.estoque.comercial.venda.Venda;

import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                System.out.println(venda);
//            }
//        }

        vendas.stream()
            .filter(Venda::isFechada)
            .forEach(System.out::println);
    }
}
