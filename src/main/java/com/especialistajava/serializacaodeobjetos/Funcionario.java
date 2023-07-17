package com.especialistajava.serializacaodeobjetos;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Funcionario implements Serializable {

    @Serial
    private static final long serialVersionUID = 8156917223456169705L;

    private Integer codigo;
    private String nome;
    private LocalDate dataNascimento;
    private transient BigDecimal salario;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        Objects.requireNonNull(dataNascimento);
        Objects.requireNonNull(salario);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public void testar() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
            "codigo=" + codigo +
            ", nome='" + nome + '\'' +
            ", dataNascimento=" + dataNascimento +
            ", salario=" + salario +
            '}';
    }
}
