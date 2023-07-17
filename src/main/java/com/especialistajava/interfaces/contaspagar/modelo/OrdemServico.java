package com.especialistajava.interfaces.contaspagar.modelo;

import com.especialistajava.interfaces.pagamento.Beneficiario;
import com.especialistajava.interfaces.pagamento.DocumentoPagavel;

import java.util.Objects;

public class OrdemServico implements DocumentoPagavel {

    private Beneficiario fornecedor;
    private double valorTotal;

    public OrdemServico(Beneficiario fornecedor, double valorTotal) {
        Objects.requireNonNull(fornecedor);
        if (valorTotal <= 0) {
            throw new IllegalArgumentException("Informe o valor total.");
        }
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
    }

    public Beneficiario getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Beneficiario fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public Beneficiario getBeneficiario() {
        return fornecedor;
    }
}
