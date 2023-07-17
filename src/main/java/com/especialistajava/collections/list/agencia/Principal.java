package com.especialistajava.collections.list.agencia;

import com.especialistajava.collections.list.agencia.model.Hotel;
import com.especialistajava.collections.list.agencia.servico.CadastroHotel;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Principal {

    private static final int SEGUNDO_HOTEL = 1;

    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1_300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1_400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itauba/SP", 1_500);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1_600);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 4_00);
//        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1_400);

        List<Hotel> hoteis = cadastro.obterTodos();

//        int indice = hoteis.indexOf(new Hotel("Vila Selvagem", "Fortim/CE", 1_400));
//        int indice = hoteis.lastIndexOf(new Hotel("Vila Selvagem", "Fortim/CE", 1_400));
//        System.out.println(indice);
//        System.out.println(hoteis.get(indice));

//        System.out.println(hoteis);
//        System.out.println(hoteis.get(SEGUNDO_HOTEL).getNome());
        imprimirHoteis(hoteis);

        cadastro.removerPorCidade("Fortim/CE");

        hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);

        cadastro.remover(new Hotel("Mercure", "Uberlândia/MG", 4_00));
        hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);

        cadastro.removerTodos();
        hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(List<Hotel> hoteis) {
        System.out.println();
        System.out.println();
        if (hoteis.isEmpty()) {
            System.out.println("Não há registros de hotéis até o momento.");
            return;
        }
//        Iterator<Hotel> hotelIterator = hoteis.iterator();
//        while (hotelIterator.hasNext()) {
//            Hotel hotel = hotelIterator.next();
//            System.out.printf("%s (%s) -> %.2f%n",
//                hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }

//        ListIterator<Hotel> hotelIterator = hoteis.listIterator(hoteis.size());
//        while (hotelIterator.hasPrevious()) {
//            Hotel hotel = hotelIterator.previous();
//            System.out.printf("%s (%s) -> %.2f%n",
//                hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }

        for (Hotel hotel : hoteis) {
            System.out.printf("%s (%s) -> %.2f%n",
                hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }

        long initialTime = System.currentTimeMillis();
//        for (Hotel hotel : hoteis) {
//            System.out.printf("Hotel: %s (%s) -> %.2f%n",
//                hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }
        long duration = System.currentTimeMillis() - initialTime;
        System.out.printf("Duration: %dms%n", duration);
    }
}
