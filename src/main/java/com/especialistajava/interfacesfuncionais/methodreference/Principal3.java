package com.especialistajava.interfacesfuncionais.methodreference;

import com.especialistajava.interfacesfuncionais.crm.produto.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal3 {

    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

//        produtos.forEach(Produto::inativar);

        var inativacaoProduto = new ServicoInativacaoProduto();
//        produtos.forEach(inativacaoProduto::processar);

        produtos.forEach(System.out::println);
    }
}
