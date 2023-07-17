package com.especialistajava.classesaninhadas.estaticas.cliente;

import java.util.Comparator;
import java.util.List;

public class Cliente {

    public enum Status {
        ATIVO, BLOQUEADO
    }

    private final String nome;
    private final int idade;
    private Status status = Status.ATIVO;

    public Cliente(String nome, int idade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("A idade informada não pode ser negativa.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public static void ordenarPorIdade(List<Cliente> clientes) {
        clientes.sort(new IdadeComparator());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Cliente{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", status=" + status +
            '}';
    }

    private static class IdadeComparator implements Comparator<Cliente> {

        @Override
        public int compare(Cliente o1, Cliente o2) {
            return Integer.compare(o1.getIdade(), o2.getIdade());
        }
    }
}
