package com.especialistajava.collections.map.cidade;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Principal3 {

    public static void main(String[] args) {
        Estado mg = new Estado("MG", "Minas Gerais");
        Estado ce = new Estado("CE", "Ceará");
        Estado ro = new Estado("RO", "Rondônia");
        Estado sp = new Estado("SP", "São Paulo");

        Cidade saoPaulo = new Cidade(3550308, "São Paulo", 12_000_000);
        Cidade beloHorizonte = new Cidade(3106200, "Belo Horizonte", 600_000);
        Cidade fortaleza = new Cidade(2304400, "Fortaleza", 500_000);
        Cidade portoVelho = new Cidade(1100205, "Porto Velho", 400_000);

        // TODO: Performance é menos importante e precisa manter a ordem natural das chaves
        Map<Estado, Cidade> capitais = new TreeMap<>();
        capitais.put(mg, beloHorizonte);
        capitais.put(ce, fortaleza);
        capitais.put(ro, portoVelho);
        capitais.put(sp, saoPaulo);

        imprimirCapitais(capitais);

    }

    private static void imprimirCapitais(Map<Estado, Cidade> capitais) {
        for (Map.Entry<Estado, Cidade> entry : capitais.entrySet()) {
            System.out.printf("%s / %s (IBGE: %d) -> Total habitantes: %d%n",
                entry.getKey().getSigla(),
                entry.getValue().getNome(),
                entry.getValue().getCodigoIbge(),
                entry.getValue().getTotalHabitantes());
        }
    }
}
