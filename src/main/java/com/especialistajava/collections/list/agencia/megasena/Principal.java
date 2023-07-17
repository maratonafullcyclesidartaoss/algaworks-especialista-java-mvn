package com.especialistajava.collections.list.agencia.megasena;

import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        Sorteador sorteador = new Sorteador();
//        Iterator<Integer> sorteadorIterator = sorteador.iterator();
//        while (sorteadorIterator.hasNext()) {
//            System.out.println(sorteadorIterator.next());
//        }
//        System.out.println(sorteadorIterator.next());
//        System.out.println(sorteadorIterator.next());
//        System.out.println(sorteadorIterator.next());
        for (Integer numeroSorteado : sorteador) {
            System.out.println(numeroSorteado);
        }
    }
}
