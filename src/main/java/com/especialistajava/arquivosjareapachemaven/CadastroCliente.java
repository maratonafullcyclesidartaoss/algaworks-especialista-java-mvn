package com.especialistajava.arquivosjareapachemaven;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CadastroCliente {

    private final List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> consultar(Predicate<Cliente> filtro) {
        return clientes.stream()
            .filter(filtro)
            .toList();
    }
}
