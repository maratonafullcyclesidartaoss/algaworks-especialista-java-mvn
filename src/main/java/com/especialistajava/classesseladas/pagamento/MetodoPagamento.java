package com.especialistajava.classesseladas.pagamento;

import java.math.BigDecimal;
import java.util.Objects;

public sealed abstract class MetodoPagamento permits Pix, CartaoDeCredito {

    private BigDecimal tarifa;

    public MetodoPagamento(BigDecimal tarifa) {
        Objects.requireNonNull(tarifa);
        this.tarifa = tarifa;
    }

    public BigDecimal getTarifa() {
        return tarifa;
    }
}
