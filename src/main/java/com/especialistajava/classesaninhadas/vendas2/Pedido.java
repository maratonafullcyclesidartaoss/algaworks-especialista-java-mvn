package com.especialistajava.classesaninhadas.vendas2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {

    private Cliente cliente;
    private final List<ItemPedido> itens = new ArrayList<>();
    private Status status = Status.RASCUNHO;
    private BigDecimal valorTotal = BigDecimal.ZERO;

    public Pedido(Cliente cliente) {
        Objects.requireNonNull(cliente);
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public ItemPedido adicionarItem(String descricao, int quantidade, BigDecimal valorUnitario) {
        ItemPedido item = new ItemPedido(descricao, quantidade, valorUnitario);
        this.itens.add(item);
        return item;
    }

    public void checarPedidoParaModificacao() {
        if (status != Status.RASCUNHO) {
            throw new RuntimeException("Pedido não pode ser modificado.");
        }
    }

    public void emitir() {
        checarPedidoParaModificacao();
        status = Status.EMITIDO;
    }

    public void cancelar() {
        checarPedidoParaModificacao();
        status = Status.CANCELADO;
    }

    public enum Status {
        RASCUNHO, EMITIDO, CANCELADO
    };

    public class ItemPedido {

        private String descricao;
        private int quantidade;
        private BigDecimal valorUnitario;

        public ItemPedido(String descricao, int quantidade, BigDecimal valorUnitario) {
            Objects.requireNonNull(descricao);
            Objects.requireNonNull(valorUnitario);
            if (descricao.isBlank()) {
                throw new IllegalArgumentException("Informe a descrição.");
            }
            if (valorUnitario.compareTo(BigDecimal.ZERO) < 1) {
                throw new RuntimeException("Valor unitário deve ser maior do que zero.");
            }
            this.descricao = descricao;
            this.valorUnitario = valorUnitario;
            setQuantidade(quantidade);
        }

        public void setQuantidade(int quantidade) {
            checarPedidoParaModificacao();
            if (quantidade < 1) {
                throw new RuntimeException("Quantidade deve ser maior do que zero.");
            }
            valorTotal = valorTotal.subtract(calcularValorTotal(this.getQuantidade()));
            this.quantidade = quantidade;
            valorTotal = valorTotal.add(calcularValorTotal(quantidade));
        }

        public int getQuantidade() {
            return quantidade;
        }

        public String getDescricao() {
            return descricao;
        }

        public BigDecimal getValorUnitario() {
            return valorUnitario;
        }

        public BigDecimal getValorTotal() {
            return this.calcularValorTotal(this.getQuantidade());
        }

        public BigDecimal calcularValorTotal(int quantidade) {
            return this.valorUnitario.multiply(new BigDecimal(String
                .valueOf(quantidade)));
        }
    }
}
