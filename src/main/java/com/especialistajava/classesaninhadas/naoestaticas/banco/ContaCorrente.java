package com.especialistajava.classesaninhadas.naoestaticas.banco;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ContaCorrente {

    private BigDecimal saldo;
    private List<Transacao> transacoes = new ArrayList<>();

    public ContaCorrente(BigDecimal saldoInicial) {
        Objects.requireNonNull(saldoInicial);
        this.saldo = saldoInicial;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return Collections.unmodifiableList(transacoes);
    }

    public class Transacao {

        private String descricao;
        private BigDecimal valor;

        public Transacao(String descricao, BigDecimal valor) {
            Objects.requireNonNull(descricao);
            Objects.requireNonNull(valor);
            if (descricao.isBlank()) {
                throw new IllegalArgumentException("Informe a descrição.");
            }
            this.descricao = descricao;
            this.valor = valor;

            saldo = saldo.subtract(valor);
            transacoes.add(this);
        }

        public String getDescricao() {
            return descricao;
        }

        public BigDecimal getValor() {
            return valor;
        }
    }
}
