package com.especialistajava.herancainterfacesboaspraticas.loja;

import com.especialistajava.herancainterfacesboaspraticas.loja.pagamento.Carrinho;
import com.especialistajava.herancainterfacesboaspraticas.loja.pagamento.ItemCarrinho;
import com.especialistajava.herancainterfacesboaspraticas.loja.pagamento.modelo.CartaoCredito;
import com.especialistajava.herancainterfacesboaspraticas.loja.pagamento.modelo.MetodoPagamento;

public class Principal {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemCarrinho("AirPods", 2_000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch", 5_100));
        carrinho.adicionarItem(new ItemCarrinho("Magic Mouse", 600));

        MetodoPagamento metodoPagamento = new CartaoCredito("5437062040689509");
        carrinho.finalizar(metodoPagamento);
    }
}
