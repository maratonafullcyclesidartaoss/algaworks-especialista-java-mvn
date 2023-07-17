package com.especialistajava.lancandoexcecoes.estoque;

public class BaixaEstoqueException extends Exception {

    public BaixaEstoqueException(String message, Throwable cause) {
        super(message, cause);
    }
}
