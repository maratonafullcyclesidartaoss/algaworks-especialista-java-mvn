package com.especialistajava.classesseladas.pagamento;

import java.math.BigDecimal;
import java.util.Objects;

public final class CartaoDeCredito extends MetodoPagamento {

    private Integer maximoParcelas;

    public CartaoDeCredito(BigDecimal tarifa, Integer maximoParcelas) {
        super(tarifa);
        Objects.requireNonNull(maximoParcelas);
        this.maximoParcelas = maximoParcelas;
    }

    public Integer getMaximoParcelas() {
        return maximoParcelas;
    }
}
