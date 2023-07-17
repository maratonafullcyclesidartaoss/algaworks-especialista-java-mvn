package com.especialistajava.classesaninhadas.vendas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {

    private enum Status {
        EMITIDO
    };

    private final Cliente cliente;
    private List<ItemPedido> itens;
    private BigDecimal valorTotal;
    private Status status;

    public Pedido(Cliente cliente) {
        Objects.requireNonNull(cliente);
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.valorTotal = BigDecimal.ZERO;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ItemPedido adicionarItem(String descricao, int quantidade, BigDecimal valorUnitario) {
        ItemPedido item = new ItemPedido(descricao, quantidade, valorUnitario);
        this.itens.add(item);
        return item;
    }

    public void emitir() {

    }

    public Status getStatus() {
        return status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public BigDecimal getValorTotal() {
        for (ItemPedido item : this.itens) {
            this.valorTotal = this.valorTotal.add(item.getValorTotal());
        }
        return valorTotal;
    }

    public class ItemPedido {

        private String descricao;
        private int quantidade;
        private BigDecimal valorUnitario;

        public ItemPedido(String descricao, int quantidade, BigDecimal valorUnitario) {
            if (descricao == null
                || descricao.isBlank()) {
                throw new IllegalArgumentException("Informe a descrição.");
            }
            if (quantidade < 0) {
                throw new IllegalArgumentException("A quantidade informada não pode ser negativa.");
            }
            Objects.requireNonNull(valorUnitario);
            this.descricao = descricao;
            this.quantidade = quantidade;
            this.valorUnitario = valorUnitario;

            valorTotal = BigDecimal.ZERO;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
            List<ItemPedido> copiaDosItens = new ArrayList<>();
            for (ItemPedido item : itens) {
                if (item.getDescricao().equals(this.getDescricao())) {
                    copiaDosItens.add(this);
                } else {
                    copiaDosItens.add(item);
                }
            }
            valorTotal = BigDecimal.ZERO;
            itens = new ArrayList<>(copiaDosItens);
        }

        public int getQuantidade() {
            return quantidade;
        }

        public BigDecimal getValorUnitario() {
            return valorUnitario;
        }

        public BigDecimal getValorTotal() {
            return valorUnitario.multiply(new BigDecimal(String.valueOf(quantidade)));
        }
    }
}
