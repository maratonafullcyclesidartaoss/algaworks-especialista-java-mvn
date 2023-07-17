package com.especialistajava.interfacesfuncionais.crm;

import com.especialistajava.interfacesfuncionais.crm.cliente.CadastroCliente;
import com.especialistajava.interfacesfuncionais.crm.cliente.Cliente;
import com.especialistajava.interfacesfuncionais.crm.cliente.Filtro;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

//        Filtro<Cliente> filtro = new Filtro<Cliente>() {
//
//            @Override
//            public boolean avaliar(Cliente cliente) {
//                return cliente.getIdade() > 40;
//            }
//        };

//        Filtro<Cliente> filtro = (Cliente cliente) -> cliente.getIdade() > 40;

        int y = 1;
//        Filtro<Cliente> filtro = new Filtro<Cliente>() {
//            @Override
//            public boolean avaliar(Cliente cliente) {
//                int y = 10;
//                System.out.println(y);
//                return cliente.getIdade() > 40;
//            }
//        };

//        List<Cliente> clientes = cadastroCliente.consultar(
//            (Cliente cliente) -> cliente.getIdade() > 40);

//        List<Cliente> clientes = cadastroCliente.consultar(
//            (Cliente cliente) -> {
//                int y = 10;
//                y++;
//                System.out.println(y);
//                boolean resultado = cliente.getIdade() > 40;
//                return resultado;
//            });

//        List<Cliente> clientes = cadastroCliente.consultar(filtro);

        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);

        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
    }
}
