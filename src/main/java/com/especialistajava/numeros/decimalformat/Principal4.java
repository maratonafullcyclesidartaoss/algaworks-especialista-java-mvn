package com.especialistajava.numeros.decimalformat;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class Principal4 {

    public static void main(String[] args) throws ParseException {
        String texto = "1.000,43";

//        Double valor = Double.valueOf(texto);

//        System.out.println(valor);

//        NumberFormat formatador = new DecimalFormat("#,##0.00");
        DecimalFormat formatador = new DecimalFormat("#,##0.00");
        formatador.setParseBigDecimal(true);
//        Number valor = formatador.parse(texto);
//        double valor = formatador.parse(texto).doubleValue();
//        double total = valor + 1_000;
//        BigDecimal valor = BigDecimal.valueOf(formatador.parse(texto).doubleValue());
        BigDecimal valor = (BigDecimal) formatador.parse(texto);
        BigDecimal total = valor.add(BigDecimal.valueOf(1_000));

//        System.out.println(valor.getClass());
        System.out.println(valor);
        System.out.println(total);
    }
}
