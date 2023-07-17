package com.especialistajava.classesseladas.pagamento;

import java.math.BigDecimal;
import java.util.Objects;

public final class Pix extends MetodoPagamento {

    private BigDecimal percentualDesconto;

    public Pix(BigDecimal tarifa, BigDecimal percentualDesconto) {
        super(tarifa);
        Objects.requireNonNull(percentualDesconto);
        this.percentualDesconto = percentualDesconto;
    }

    public BigDecimal getPercentualDesconto() {
        return percentualDesconto;
    }
}
