package com.especialistajava.arquivosjareapachemaven;

public class Cliente {

    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalStateException("Informe o nome.");
        }
        if (idade < 1) {
            throw new IllegalArgumentException("A idade do cliente deve ser maior do que zero.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            '}';
    }
}
