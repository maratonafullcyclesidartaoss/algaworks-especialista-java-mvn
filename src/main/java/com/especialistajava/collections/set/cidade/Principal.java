package com.especialistajava.collections.set.cidade;

import com.especialistajava.collections.set.cidade.model.Cidade;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
//        System.out.println("--------------------");
//        // Performance é mais importante (não garante a ordem dos elementos)
//        long initialTime = System.currentTimeMillis();
//        Set<Cidade> cidades = new HashSet<>();
//        cidades.add(new Cidade(3170206, "Uberlândia", 706_000));
//        cidades.add(new Cidade(3170207, "Uberaba", 340_277));
//        cidades.add(new Cidade(3170308, "São Paulo", 12_390_000));
//        cidades.add(new Cidade(3170200, "Belo Horizonte", 706_000));
//        cidades.add(new Cidade(3170400, "Fortaleza", 2_703_000));
//        cidades.add(new Cidade(1100205, "Porto Velho", 548_000));
//
//        imprimirCidades(cidades);
//
//        long duration = System.currentTimeMillis() - initialTime;
//        System.out.printf("HASHSET: duration -> %d%n", duration);
//
//        System.out.println("--------------------");
//
//        // Performance é importante, mas precisa manter ordem de inserção dos elementos
//        long initialTime = System.currentTimeMillis();
//        Set<Cidade> cidades = new LinkedHashSet<>();
//        cidades.add(new Cidade(3170206, "Uberlândia", 706_000));
//        cidades.add(new Cidade(3170207, "Uberaba", 340_277));
//        cidades.add(new Cidade(3170308, "São Paulo", 12_390_000));
//        cidades.add(new Cidade(3170200, "Belo Horizonte", 706_000));
//        cidades.add(new Cidade(3170400, "Fortaleza", 2_703_000));
//        cidades.add(new Cidade(1100205, "Porto Velho", 548_000));
//
//        imprimirCidades(cidades);
//
//        long duration = System.currentTimeMillis() - initialTime;
//        System.out.printf("LINKEDHASHSET: duration -> %d%n", duration);
//
        System.out.println("--------------------");
//
//        // Performance é menos importante e precisa manter a ordem natural dos elementos
        long initialTime = System.currentTimeMillis();
        Set<Cidade> cidades = new TreeSet<>();
        cidades.add(new Cidade(3170206, "Uberlândia", 706_000));
        cidades.add(new Cidade(3170207, "Uberaba", 340_277));
        cidades.add(new Cidade(3170308, "São Paulo", 12_390_000));
        cidades.add(new Cidade(3170200, "Belo Horizonte", 706_000));
        cidades.add(new Cidade(3170400, "Fortaleza", 2_703_000));
        cidades.add(new Cidade(1100205, "Porto Velho", 548_000));

        imprimirCidades(cidades);

        long duration = System.currentTimeMillis() - initialTime;
        System.out.printf("TREESET: duration -> %d%n", duration);

        System.out.println("--------------------");

    }

    private static void imprimirCidades(Set<Cidade> cidades) {
        for (Cidade cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
