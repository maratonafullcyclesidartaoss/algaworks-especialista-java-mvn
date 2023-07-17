package com.especialistajava.interfacesfuncionais.methodreference;

import com.especialistajava.interfacesfuncionais.crm.produto.Produto;

public class ServicoInativacaoProduto {

    public static void processar(Produto produto) {
        System.out.println("Inativando "+ produto.getNome());
        produto.inativar();
    }
}
