package com.especialistajava.interfacesfuncionais.crm;

import com.especialistajava.interfacesfuncionais.crm.cliente.CadastroCliente;
import com.especialistajava.interfacesfuncionais.crm.cliente.Cliente;

import java.util.List;

public class Principal3 {

    public static void main(String[] args) {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);

        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
    }
}
