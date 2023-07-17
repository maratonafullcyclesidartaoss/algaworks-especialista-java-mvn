package com.especialistajava.reflectionapianotacoeseclassesseladas.crm;

import com.especialistajava.reflectionapianotacoeseclassesseladas.crm.entidade.Produto;
import com.especialistajava.reflectionapianotacoeseclassesseladas.csv.GeradorCSV;

import java.math.BigDecimal;
import java.util.Arrays;

public class Principal2 {

    public static void main(String[] args) {
        var produtos = Arrays.asList(
            new Produto(1L, "Macbook Pro", BigDecimal.valueOf(19500), 25),
            new Produto(2L, "iPhone", BigDecimal.valueOf(12300), 7),
            new Produto(4L, "Monitor", BigDecimal.valueOf(1800), 18));

        GeradorCSV.imprimir(Produto.class, produtos);
    }
}
