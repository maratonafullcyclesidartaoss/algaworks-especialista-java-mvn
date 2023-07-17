package com.especialistajava.numeros.decimalformat;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Principal {

    public static void main(String[] args) {
        double a = 4_142_298.4238;
        float b = 0.3f;
        int c = -1;
        BigDecimal d = BigDecimal.valueOf(45.362);

//        NumberFormat formatador = new DecimalFormat("#.###");
//        NumberFormat formatador = new DecimalFormat("#.##");
//        NumberFormat formatador = new DecimalFormat("000.000");
//        NumberFormat formatador = new DecimalFormat("0.00");
//        formatador.setRoundingMode(RoundingMode.DOWN);
//        NumberFormat formatador = new DecimalFormat("0,000.00");
//        NumberFormat formatador = new DecimalFormat("¤ #,##0.00");
//        NumberFormat formatador = new DecimalFormat("\u00A4 #,##0.00");
//        NumberFormat formatador = NumberFormat.getPercentInstance();
        NumberFormat formatador = NumberFormat.getCurrencyInstance();

        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));
    }
}
