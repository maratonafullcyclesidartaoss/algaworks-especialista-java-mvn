package com.especialistajava.mergulhandoorientacaoobjetos;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;
    private int tempoDeUsoEmAnos;

    void imprimirIpva() {
        double ipva = this.calcularIpva();
        System.out.printf("Valor IPVA: R$ %6.2f%n%n", ipva);
    }

    void imprimirResumoDepreciacao() {
        if (this.precoCompra <= 0) {
            System.out.println("Carro com preço de compra zerado. Não foi possível imprimir resumo de depreciação.");
            return;
        }

        int tempoDeUsoSeuCarro = this.calcularTempoDeUsoEmAnos();
        System.out.printf("Tempo de uso (em anos): %d%n", tempoDeUsoSeuCarro);

        double valorRevendaSeuCarro = this.calcularValorRevenda();
        System.out.printf("Valor de revenda: R$ %6.2f%n%n", valorRevendaSeuCarro);
    }

    double calcularIpva() {
        tempoDeUsoEmAnos = this.calcularTempoDeUsoEmAnos();

        if (tempoDeUsoEmAnos >= 10) {
            return 0;
        }

        return this.calcularValorRevenda() * 0.04;
    }

    int calcularTempoDeUsoEmAnos() {
        int anoAtual = 2023;
        return anoAtual - this.anoFabricacao;
    }

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = this.calcularTempoDeUsoEmAnos();
        int tempoPadraoDepreciacaoEmAnos = 20;
        int anosParaDepreciar = tempoPadraoDepreciacaoEmAnos - tempoDeUsoEmAnos;
        double valorRevenda = (precoCompra / tempoPadraoDepreciacaoEmAnos) * (anosParaDepreciar);
        if (valorRevenda < 0) {
            valorRevenda = 0;
        }
        return valorRevenda;
    }
}