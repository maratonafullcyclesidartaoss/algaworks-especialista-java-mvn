package com.especialistajava.enumeracoes.pedido;

public class ServicoCancelamentoPedido {

    public void cancelar(Pedido pedido, TipoUsuario tipoUsuario) {
        pedido.cancelar();

        if (TipoUsuario.CLIENTE.equals(tipoUsuario)) {
            System.out.println("Notificando o gerente sobre o cancelamento do pedido.");
        }
    }
}
