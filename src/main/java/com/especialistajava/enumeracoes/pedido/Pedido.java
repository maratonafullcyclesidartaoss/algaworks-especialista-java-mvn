package com.especialistajava.enumeracoes.pedido;

public class Pedido {

    public static final int STATUS_RASCUNHO = 0;
    public static final int STATUS_EMITIDO = 1;
    public static final int STATUS_FATURADO = 2;
    public static final int STATUS_DESPACHADO = 3;
    public static final int STATUS_ENTREGUE = 4;
    public static final int STATUS_CANCELADO = 5;

    public static final int ORIGEM_BALCAO = 0;
    public static final int ORIGEM_ONLINE = 1;

    private String nomeCliente;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;
    private double valorTotal;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public int getTempoEntregaEmHoras() {
        return status.getTempoEntregaEmHoras();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void marcarComoEntregue() {
        status = StatusPedido.ENTREGUE;
    }

    public void emitir() {
        status = StatusPedido.EMITIDO;
    }

    public void cancelar() {
        if (status.podeMudarParaCancelado(getValorTotal())) {
            status = StatusPedido.CANCELADO;
        } else {
            throw new IllegalStateException("Pedido não pode ser cancelado.");
        }
    }

    public void retornarStatusOriginal() {
        status = StatusPedido.RASCUNHO;
    }

    public void marcarComoEmAnalise() {
        status = StatusPedido.EM_ANALISE;
    }
}
