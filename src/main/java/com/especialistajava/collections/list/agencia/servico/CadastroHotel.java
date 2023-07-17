package com.especialistajava.collections.list.agencia.servico;

import com.especialistajava.collections.list.agencia.model.Hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CadastroHotel {

    private final List<Hotel> hoteis;

    public CadastroHotel() {
        hoteis = new ArrayList<>();
    }

    public List<Hotel> getHoteis() {
        return hoteis;
    }

    public void adicionar(String nome, String cidade, double precoDiaria) {
        long initialTime = System.currentTimeMillis();
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);
        if (getHoteis().contains(hotel)) {
            throw new HotelJaExistenteException("O hotel informado já foi adicionado.");
        }
//        this.hoteis.add(0, hotel);
        this.hoteis.add(hotel);
        long duration = System.currentTimeMillis() - initialTime;
        System.out.printf("DEBUG <<adicionar>>: Duration: %dms%n", duration);
    }

    public List<Hotel> obterTodos() {
        return getHoteis();
    }

    public void removerPorCidade(String cidade) {
//        List<Hotel> hoteisParaRemocao = new ArrayList<>();

//        for (int i = 0; i < hoteis.size(); i++) {
//            Hotel hotel = hoteis.get(i);
//            if (hotel.getCidade().equals(cidade)) {
//                hoteisParaRemocao.add(hotel);
//                hoteis.remove(i);
//                i--;
//            }
//        }
//        hoteis.removeAll(hoteisParaRemocao);
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            if (hotel.getCidade().equals(cidade)) {
                hotelIterator.remove();
            }
        }
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
}
