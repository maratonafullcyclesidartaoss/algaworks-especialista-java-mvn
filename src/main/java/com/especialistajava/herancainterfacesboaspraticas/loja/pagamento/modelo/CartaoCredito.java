package com.especialistajava.herancainterfacesboaspraticas.loja.pagamento.modelo;

public class CartaoCredito implements MetodoPagamento {

    private final String numero;

    public CartaoCredito(String numero) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o número.");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void pagar(double valor) {
        if (!numero.startsWith("123")) {
            throw new RuntimeException("Pagamento negado");
        }
        System.out.printf("Pagamento de R$ %.2f realizado. Cartão de cŕedito %s%n",
                valor, getNumero());
    }
}
