package com.especialistajava.herancainterfacesboaspraticas.loja.pagamento;

public class ItemCarrinho {

    private String descricao;
    private double valor;

    public ItemCarrinho(String descricao, double valor) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe a descrição.");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("Informe o valor.");
        }
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
