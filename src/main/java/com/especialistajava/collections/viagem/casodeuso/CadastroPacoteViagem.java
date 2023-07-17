package com.especialistajava.collections.viagem.casodeuso;

import com.especialistajava.collections.linkedlist.agenciaviagem.model.Hotel;
import com.especialistajava.collections.viagem.PacoteViagemComparator;
import com.especialistajava.collections.viagem.PacoteViagemJaExistenteException;
import com.especialistajava.collections.viagem.PacoteViagemNaoEncontradoException;
import com.especialistajava.collections.viagem.model.PacoteViagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CadastroPacoteViagem {

    private final List<PacoteViagem> pacotes;

    public CadastroPacoteViagem() {
        pacotes = new ArrayList<>();
    }

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);
        if (pacotes.contains(pacoteViagem)) {
            throw new PacoteViagemJaExistenteException("O pacote de viagem informado já existe.");
        }
        this.pacotes.add(pacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        return pacotes;
    }

    public void ordenar() {
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        Collections
            .sort(pacotes, new PacoteViagemComparator()
                .reversed());
    }

    public void removerPorDescricao(String descricao) {
        Iterator<PacoteViagem> pacoteViagemIterator = pacotes.iterator();
        while (pacoteViagemIterator.hasNext()) {
            PacoteViagem pacoteViagem = pacoteViagemIterator.next();
            if (pacoteViagem.getDescricao().equals(descricao)) {
                pacoteViagemIterator.remove();
                return;
            }
        }
        throw new PacoteViagemNaoEncontradoException("O pacote de viagem informado não foi encontrado para remoção.");
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)) {
                return pacote;
            }
        }
        throw new PacoteViagemNaoEncontradoException("O pacote de viagem informado não foi encontrado");
    }
}
