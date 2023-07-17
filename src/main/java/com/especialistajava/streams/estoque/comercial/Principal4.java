package com.especialistajava.streams.estoque.comercial;

import com.especialistajava.streams.estoque.comercial.venda.ServicoDeVenda;
import com.especialistajava.streams.estoque.comercial.venda.Venda;

import java.math.BigDecimal;
import java.util.List;

public class Principal4 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

//        BigDecimal totalVendas = BigDecimal.ZERO;
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                totalVendas = totalVendas.add(venda.getValorTotal());
//            }
//        }

        BigDecimal totalVendas = vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getValorTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(totalVendas);
    }
}
