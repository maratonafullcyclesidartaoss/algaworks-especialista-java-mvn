package com.especialistajava.classesseladas.loja;

import com.especialistajava.classesseladas.pagamento.CartaoDeCredito;
import com.especialistajava.classesseladas.pagamento.MetodoPagamento;
import com.especialistajava.classesseladas.pagamento.Pix;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Checkout {

    public String calcular(BigDecimal valor, MetodoPagamento metodoPagamento) {
        if (metodoPagamento instanceof Pix pix) {
            BigDecimal desconto = valor.multiply(pix.getPercentualDesconto())
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_EVEN);
            BigDecimal valorComDesconto = valor.subtract(desconto);
            return String.format("R$ %.2f à vista no PIX", valorComDesconto);
        } else if (metodoPagamento instanceof CartaoDeCredito cartao) {
            BigDecimal valorParcela = valor.divide(BigDecimal.valueOf(cartao.getMaximoParcelas()), 2, RoundingMode.HALF_EVEN);
            return String.format("%dx R$ %.2f no cartão de crédito", cartao.getMaximoParcelas(), valorParcela);
        }
        throw new RuntimeException("Método de pagamento desconhecido");
    }
}
