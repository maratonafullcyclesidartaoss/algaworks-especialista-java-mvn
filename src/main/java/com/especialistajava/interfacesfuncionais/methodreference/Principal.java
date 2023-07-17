package com.especialistajava.interfacesfuncionais.methodreference;

import com.especialistajava.interfacesfuncionais.crm.produto.Produto;

import java.util.function.Consumer;
import java.util.function.ToIntFunction;

public class Principal {

    public static void main(String[] args) {
        ToIntFunction<Produto> function1 = produto -> produto.getQuantidade();
        Consumer<Produto> consumer1 = produto -> produto.inativar();

        ToIntFunction<Produto> function2 = Produto::getQuantidade;
        Consumer<Produto> consumer2 = Produto::inativar;


    }
}
