package com.especialistajava.construtorespacotesevisibilidade;

import java.util.UUID;

public class Participante {

    public static final int SALDO_INICIAL_DE_PONTOS = 10;
    public static final String NOME_PADRAO = "Sem nome";

    private String nome;
    private int saldoDePontos;
    private final String codigo;

    public Participante() {
        this(NOME_PADRAO);
    }

    public Participante(String nome) {
        this(nome, SALDO_INICIAL_DE_PONTOS);
    }

    private Participante(String nome, int saldoDePontosInicial) {
        if (nome == null || "".equals(nome.trim())) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        if (saldoDePontosInicial < SALDO_INICIAL_DE_PONTOS) {
            throw new IllegalArgumentException("O saldo de pontos inicial não pode ser menor do que dez.");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
        this.codigo = this.gerarCodigo();
    }

    public void creditarPontos(int pontos) {
        this.saldoDePontos += pontos;
    }

    public void imprimirSaldoDePontos() {
        System.out.printf("Codigo: %s, Nome: %s. Saldo de pontos: %d%n", this.codigo, this.nome, this.saldoDePontos);
    }

    private String gerarCodigo() {
        return UUID.randomUUID().toString();
    }
}