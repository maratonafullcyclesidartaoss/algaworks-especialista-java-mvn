package com.especialistajava.collections.comercial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Venda {

    private final Cliente cliente;
    private final List<ItemVenda> itens;
    private double valorTotal;

    public Venda(Cliente cliente) {
        Objects.requireNonNull(cliente);
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<ItemVenda> getItens() {
//        return new ArrayList<>(itens);
        return Collections.unmodifiableList(itens);
    }

    public void adicionarItem(ItemVenda item) {
        if (this.itens.contains(item)) {
            throw new ItemDeVendaJaExistenteException("Item de venda já existente.");
        }
        if (this.excedeLimiteDeCompra(item)) {
            throw new LimiteDeCompraExcedidoException(
                String.format("Limite atual: %.2f", cliente.getLimiteCompras()));
        }
        this.valorTotal += item.getValor();
        this.itens.add(item);
    }

    public boolean excedeLimiteDeCompra(ItemVenda item) {
        return valorTotal + item.getValor() > cliente.getLimiteCompras();
    }
}
