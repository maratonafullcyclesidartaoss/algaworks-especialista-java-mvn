package com.especialistajava.generics.crm.escola;

public class Pesquisador {

//    public static <T extends Nomeavel & PessoaJuridica> T obterPorNome(T[] pessoas, String nome) {
    public static <T extends Nomeavel> T obterPorNome(T[] pessoas, String nome) {
        for (T pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        throw new RuntimeException("Pessoa não encontrada pelo nome");
    }
}
