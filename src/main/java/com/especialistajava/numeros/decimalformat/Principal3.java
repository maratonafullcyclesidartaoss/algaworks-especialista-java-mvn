package com.especialistajava.numeros.decimalformat;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Principal3 {

    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(398.22);
        BigDecimal b = BigDecimal.valueOf(2469.44);
        BigDecimal c = BigDecimal.valueOf(4142298.42);
        BigDecimal d = BigDecimal.valueOf(8404142298.0);

//        NumberFormat formatador = NumberFormat.getCompactNumberInstance();
//        NumberFormat formatador = NumberFormat.getCompactNumberInstance(
//            Locale.US, NumberFormat.Style.LONG);
//        NumberFormat formatador = NumberFormat.getCompactNumberInstance(
//            new Locale("pt", "BR"), NumberFormat.Style.LONG);
        NumberFormat formatador = NumberFormat.getCompactNumberInstance(
            new Locale("pt", "BR"), NumberFormat.Style.SHORT);

        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));
    }
}
