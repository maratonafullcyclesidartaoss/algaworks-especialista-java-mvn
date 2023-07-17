package com.especialistajava.enumeracoes.pedido;

public class Principal4 {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
//        pedido.setStatus(StatusPedido.CANCELADO);
        pedido.setValorTotal(190);
//        pedido.marcarComoEntregue();
        pedido.emitir();
        pedido.cancelar();
        System.out.println(pedido.getStatus());

//        System.out.println(pedido.getTempoEntregaEmHoras());
    }
}
