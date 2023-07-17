package com.especialistajava.collections.linkedlist.agenciaviagem.casouso;

import com.especialistajava.collections.linkedlist.agenciaviagem.PrecoHotelComparator;
import com.especialistajava.collections.linkedlist.agenciaviagem.model.Hotel;
import com.especialistajava.collections.list.agencia.servico.HotelJaExistenteException;
import com.especialistajava.collections.list.agencia.servico.HotelNaoEncontradoException;

import java.util.*;
//import java.util.LinkedList;


public class CadastroHotel {

    private final List<Hotel> hoteis;

    public CadastroHotel() {
//        hoteis = new LinkedList<>();
        hoteis = new Vector<>();
    }

    public void adicionar(String nome, String cidade, double precoDiaria) {
        long initialTime = System.currentTimeMillis();

        Hotel hotel = new Hotel(nome, cidade, precoDiaria);
        if (getHoteis().contains(hotel)) {
            throw new HotelJaExistenteException("O hotel informado já foi adicionado.");
        }
        this.hoteis.add(hotel);
        long duration = System.currentTimeMillis() - initialTime;
        System.out.printf("DEBUG <<adicionar>>: Duration: %dms%n", duration);
    }

    public List<Hotel> getHoteis() {
        return hoteis;
    }

    public List<Hotel> obterTodos() {
        return getHoteis();
    }

    public void removerPorCidade(String cidade) {
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            if (hotel.getCidade().equals(cidade)) {
                hotelIterator.remove();
            }
        }
    }

    public Hotel[] obterTodosComoArray() {
        return hoteis.toArray(new Hotel[0]);
    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);
        if (!removido) {
            throw new HotelNaoEncontradoException("O hotel não foi encontrado para remoção.");
        }
    }

    public void removerTodos() {
        hoteis.clear();
    }

    public void ordenar() {
        Collections.sort(hoteis);
    }

    public void ordernarPorPreco() {
//        Collections.sort(hoteis, new PrecoHotelComparator());
        hoteis.sort(new PrecoHotelComparator().reversed()
            .thenComparing(Comparator.naturalOrder()));
    }
}
