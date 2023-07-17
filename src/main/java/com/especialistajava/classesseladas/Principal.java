package com.especialistajava.classesseladas;

import com.especialistajava.classesseladas.loja.Checkout;
import com.especialistajava.classesseladas.pagamento.CartaoDeCredito;
import com.especialistajava.classesseladas.pagamento.Pix;

import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {
        var checkout = new Checkout();
        var cartao = new CartaoDeCredito(BigDecimal.valueOf(3.49), 12);
        var pix = new Pix(BigDecimal.valueOf(0.79), BigDecimal.valueOf(5));

        BigDecimal valorTotal = BigDecimal.valueOf(2800);

        System.out.println(checkout.calcular(valorTotal, cartao));
        System.out.println(checkout.calcular(valorTotal, pix));

//        var dinheiro = new Dinheiro(BigDecimal.valueOf(0.79));
//        System.out.println(checkout.calcular(valorTotal, dinheiro));
    }
}
