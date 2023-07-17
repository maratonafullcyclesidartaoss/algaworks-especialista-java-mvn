package com.especialistajava.enumeracoes.notafiscal;

public class NotaFiscal {

//    public static final int STATUS_NAO_EMITIDA = 0;
//    public static final int STATUS_EMITIDA = 1;
//    public static final int STATUS_CANCELADA = 2;

    private Integer numero;
    private String descricao;
    private double valor;
    private StatusNotaFiscal status = StatusNotaFiscal.NAO_EMITIDA;

    public NotaFiscal(int numero, String descricao, double valor) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número da nota fiscal não pode ser negativo.");
        }
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição da nota fiscal deve ser informada.");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da nota fiscal não pode ser negativo ou zero.");
        }
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusNotaFiscal getStatus() {
        return status;
    }

    public void emitir() {
        if (status.podeEmitir()) {
            status = StatusNotaFiscal.EMITIDA;
        } else {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }
    }

    public void cancelar() {
        if (status.podeCancelar(getValor())) {
            status = StatusNotaFiscal.CANCELADA;
        } else {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal.");
        }
    }

    public String getDescricaoCompleta() {
        return String.format("Nota fiscal #%d (%s) no valor de R$ %.2f está %s",
            getNumero(), getDescricao(), getValor(), status.getDescricao());
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
            "numero=" + numero +
            ", descricao='" + descricao + '\'' +
            ", valor=" + valor +
            '}';
    }
}
