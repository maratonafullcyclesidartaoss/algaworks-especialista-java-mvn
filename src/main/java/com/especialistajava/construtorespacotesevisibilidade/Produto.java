package com.especialistajava.construtorespacotesevisibilidade;

import java.util.Objects;

public class Produto {

    public static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    private String nome;
    private int quantidadeEstoque;
    private Fornecedor fornecedor;
    private Categoria categoria;

    public Produto() {
        this("Sem nome");
    }

    public Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    private Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório.");
        if (estoqueInicial < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo.");
        }
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
    }
}

class Fornecedor {

}

class Categoria {

}