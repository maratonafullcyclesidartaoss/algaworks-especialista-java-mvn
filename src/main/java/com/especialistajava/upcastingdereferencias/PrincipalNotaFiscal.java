package com.especialistajava.upcastingdereferencias;

public class PrincipalNotaFiscal {

    public static void main(String[] args) {
//        var nf = new NotaFiscal("Supermercado", 118.9);
        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 900, true);

        GestorFiscal gestorFiscal = new GestorFiscal();
        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());
    }
}
