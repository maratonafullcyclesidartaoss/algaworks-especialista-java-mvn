package com.especialistajava.collections.linkedlist.agenciaviagem;


import com.especialistajava.collections.linkedlist.agenciaviagem.casouso.CadastroHotel;
import com.especialistajava.collections.linkedlist.agenciaviagem.model.Hotel;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1_300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1_300);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itauba/SP", 1_300);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1_600);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 4_00);

        cadastro.ordernarPorPreco();

        List<Hotel> hoteis = cadastro.obterTodos();
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

        for (Hotel hotel : hoteis) {
            System.out.printf("%s (%s) -> %.2f%n",
                hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }

        long initialTime = System.currentTimeMillis();
        long duration = System.currentTimeMillis() - initialTime;
        System.out.printf("Duration: %dms%n", duration);
    }
}
