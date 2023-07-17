package com.especialistajava.wrapperseboxing;

public class PrincipalConversao {

    public static void main(String[] args) {
        int idade = 20;
        short idadeShort = (short) idade;

        Integer diasEntrega = Integer.valueOf(30);

        Short diasEntregaShort = Short.valueOf(diasEntrega.shortValue());

        Long diasEntregaLong = Long.valueOf(diasEntrega.longValue());

        Double valorTotal = Double.valueOf(1500.2);
    }
}