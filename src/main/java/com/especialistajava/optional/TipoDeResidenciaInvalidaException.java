package com.especialistajava.optional;

public class TipoDeResidenciaInvalidaException extends RuntimeException {

    public TipoDeResidenciaInvalidaException() {
    }

    public TipoDeResidenciaInvalidaException(String message) {
        super(message);
    }
}
