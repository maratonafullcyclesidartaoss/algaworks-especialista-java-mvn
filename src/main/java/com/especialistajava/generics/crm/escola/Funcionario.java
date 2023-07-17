package com.especialistajava.generics.crm.escola;

public class Funcionario implements Nomeavel {

    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome deve ser informado.");
        }
        if (idade <= 0) {
            throw new IllegalArgumentException("A idade deve ser informada.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    @Override
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
        return "Funcionario{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            '}';
    }
}
