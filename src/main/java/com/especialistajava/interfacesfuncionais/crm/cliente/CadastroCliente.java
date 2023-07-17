package com.especialistajava.interfacesfuncionais.crm.cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CadastroCliente {

    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionar(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Cliente> consultar(Predicate<Cliente> filtro) {
        List<Cliente> clientesFiltrados = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if (filtro.test(cliente)) {
                clientesFiltrados.add(cliente);
            }
        }

        return clientesFiltrados;
    }
}
