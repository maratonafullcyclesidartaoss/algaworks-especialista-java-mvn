package com.especialistajava.collections.viagem;

import com.especialistajava.collections.viagem.casodeuso.CadastroPacoteViagem;
import com.especialistajava.collections.viagem.model.PacoteViagem;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        CadastroPacoteViagem cadastro = new CadastroPacoteViagem();
        cadastro.adicionar("Istambul e Capadócia (20 noites)", 18_000);
        cadastro.adicionar("Neve em Bariloche (10 noites)", 11_000);
        cadastro.adicionar("Disney (10 noites)", 20_000);
        cadastro.adicionar("Natal Luz em Gramado (5 noites)", 8_500);

        imprimirPacotes(cadastro.obterTodos());

//        cadastro.removerPorDescricao("Disney (10 noites)");
//        imprimirPacotes(cadastro.obterTodos());

//        cadastro.ordenar();
//        imprimirPacotes(cadastro.obterTodos());

//        cadastro.ordenarPorPrecoDecrescente();
//        imprimirPacotes(cadastro.obterTodos());

//        cadastro.buscarPorDescricao("Disney (7 noites)");

    }

    private static void imprimirPacotes(List<PacoteViagem> pacotes) {
        System.out.print("\n\n");
        for (PacoteViagem pacote : pacotes) {
            System.out.printf("%s -> R$ %.2f%n",
                    pacote.getDescricao(), pacote.getPrecoPorPessoa());
        }
    }
}
