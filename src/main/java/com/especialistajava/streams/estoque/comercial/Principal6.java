package com.especialistajava.streams.estoque.comercial;

import com.especialistajava.streams.estoque.comercial.venda.Cliente;
import com.especialistajava.streams.estoque.comercial.venda.ServicoDeVenda;
import com.especialistajava.streams.estoque.comercial.venda.Venda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal6 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

//        List<String> clientes = new ArrayList<>();
//
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                if (!clientes.contains(venda.getCliente().nome())) {
//                    clientes.add(venda.getCliente().nome());
//                }
//            }
//        }

        List<String> clientes = vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getCliente)
                .map(Cliente::nome)
                .distinct()
                .sorted()
                .toList();

//        Collections.sort(clientes);
        System.out.println(clientes);
    }
}
