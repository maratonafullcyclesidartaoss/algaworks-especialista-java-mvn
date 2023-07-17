package com.especialistajava.numeros.decimalformat;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Cambio {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Preço do produto em Dólares: ");
        String valorDolar = scanner.next();

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formatadorDolar = new DecimalFormat("#,##0.00;(#,##0.00)", symbols);
        formatadorDolar.setParseBigDecimal(true);

        BigDecimal valorConvertidoDolar = (BigDecimal) formatadorDolar.parse(valorDolar);

        System.out.print("Preço de 1 Dólar em Real: ");
        String cambioReal = scanner.next();

        DecimalFormat formatadorReais = new DecimalFormat("#,##0.00;(#,##0.00)");
        formatadorReais.setParseBigDecimal(true);

        BigDecimal cambioConvertidoReais = (BigDecimal) formatadorReais.parse(cambioReal);
        BigDecimal totalEmReais = valorConvertidoDolar.multiply(cambioConvertidoReais);

        NumberFormat formatadorResultadoReais = NumberFormat.getCurrencyInstance(
            new Locale("pt", "BR"));

        System.out.printf("Preço do produto em Reais: %s%n",
            formatadorResultadoReais.format(
                totalEmReais.setScale(2, RoundingMode.HALF_EVEN)));
    }
}
