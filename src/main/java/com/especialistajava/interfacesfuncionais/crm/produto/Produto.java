package com.especialistajava.interfacesfuncionais.crm.produto;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {

    public enum Status {
        ATIVO, INATIVO
    }

    private String nome;
    private BigDecimal preco;
    private int quantidade;
    private Status status = Status.ATIVO;

    public Produto(String nome) {
        Objects.requireNonNull(nome);
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        this.nome = nome;
    }

    public Produto(String nome, BigDecimal preco, int quantidade) {
        this(nome);
        Objects.requireNonNull(preco);
        if (preco.compareTo(BigDecimal.ZERO) < 1) {
            throw new IllegalArgumentException("Preço deve ser maior do que zero.");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negartiva.");
        }
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, BigDecimal preco, int quantidade, Status status) {
        this(nome, preco, quantidade);
        Objects.requireNonNull(status);
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Status getStatus() {
        return status;
    }

    public void inativar() {
        this.status = Status.INATIVO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Produto{" +
            "nome='" + nome + '\'' +
            ", preco=" + preco +
            ", quantidade=" + quantidade +
            ", status=" + status +
            '}';
    }
}
