package com.especialistajava.lancandoexcecoes.cliente;

import com.especialistajava.lancandoexcecoes.cliente.model.Cliente;
import com.especialistajava.lancandoexcecoes.cliente.servico.ServicoCadastroCliente;

public class Principal {

    public static void main(String[] args) {
        ServicoCadastroCliente servicoCadastroCliente = new ServicoCadastroCliente();
        Cliente clienteCadastrado = servicoCadastroCliente.cadastrar("João", 17);

        System.out.printf("Cliente cadastrado: %s%n", clienteCadastrado.getNome());
    }
}
