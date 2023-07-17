package com.especialistajava.generics.crm;

import com.especialistajava.generics.crm.cliente.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Supermercado Pague e Leve", 700_000));
        clientes.add(new Cliente("Posto Gasolina Boa", 800_000));

        double totalFaturamento = 0d;

        for (Cliente cliente : clientes) {
            totalFaturamento += cliente.getFaturamentoMensal();
        }

        System.out.println(totalFaturamento);
    }
}
