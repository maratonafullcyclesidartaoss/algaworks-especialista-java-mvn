package com.especialistajava.enumeracoes.pedido;

public class Principal5 {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setValorTotal(90);
//        pedido.retornarStatusOriginal();
        pedido.marcarComoEmAnalise();
        pedido.cancelar();

        System.out.println(pedido.getStatus());

    }
}
