package com.especialistajava.collections.map.detran.model;

public class Proprietario {

    private String nome;
    private String cpf;

    public Proprietario(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome deve ser informado.");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("O CPF deve ser informado.");
        }
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Proprietario{" +
            "nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            '}';
    }
}
