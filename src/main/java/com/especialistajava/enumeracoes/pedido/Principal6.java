package com.especialistajava.enumeracoes.pedido;

public class Principal6 {

    public static void main(String[] args) {
        ServicoCancelamentoPedido servico = new ServicoCancelamentoPedido();

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setValorTotal(90);

        System.out.println(pedido.getStatus());

        servico.cancelar(pedido, TipoUsuario.CLIENTE);

    }
}
