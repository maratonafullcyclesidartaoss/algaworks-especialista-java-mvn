package com.especialistajava.upcastingdereferencias;

public class GestorFiscal {

    public void emitirNotasFiscais(NotaFiscal... notasFiscais) {
        for (NotaFiscal notaFiscal : notasFiscais) {
            notaFiscal.emitir();
            System.out.println("--------------------");
            System.out.println();
        }
    }
}
