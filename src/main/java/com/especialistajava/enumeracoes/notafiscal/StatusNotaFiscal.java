package com.especialistajava.enumeracoes.notafiscal;

public enum StatusNotaFiscal {

    NAO_EMITIDA("Não Emitida") {
        @Override
        public boolean podeCancelar(double valor) {
            return true;
        }

        @Override
        public boolean podeEmitir() {
            return true;
        }
    }, EMITIDA("Emitida") {
        @Override
        public boolean podeCancelar(double valor) {
            return valor < VALOR_EXCEDIDO;
        }

        @Override
        public boolean podeEmitir() {
            return false;
        }
    }, CANCELADA("Cancelada") {
        @Override
        public boolean podeCancelar(double valor) {
            return false;
        }

        @Override
        public boolean podeEmitir() {
            return false;
        }
    };

    public static final int VALOR_EXCEDIDO = 1_000;

    private String descricao;

    private StatusNotaFiscal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract boolean podeCancelar(double valor);
    public abstract boolean podeEmitir();
}
