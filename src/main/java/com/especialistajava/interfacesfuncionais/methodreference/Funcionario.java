package com.especialistajava.interfacesfuncionais.methodreference;

import java.math.BigDecimal;
import java.util.Objects;

public class Funcionario {

    public enum Status {
        ATIVO, INATIVO
    }

    private String nome;
    private BigDecimal salario;
    private Status status = Status.ATIVO;

    public Funcionario(String nome, BigDecimal salario, Status status) {
        Objects.requireNonNull(nome);
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        Objects.requireNonNull(salario);
        if (salario.compareTo(BigDecimal.ZERO) < 1) {
            throw new IllegalArgumentException("Salário deve ser maior do que zero.");
        }
        Objects.requireNonNull(status);
        this.nome = nome;
        this.salario = salario;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public Status getStatus() {
        return status;
    }

    public boolean isInativo() {
        return status == Status.INATIVO;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
            "nome='" + nome + '\'' +
            ", salario=" + salario +
            ", status=" + status +
            '}';
    }
}
