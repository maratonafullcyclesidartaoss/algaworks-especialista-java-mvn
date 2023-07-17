package com.especialistajava.trabalhandocomarrays;

import java.util.Objects;

public class ServicoDeCobranca {

    public static final int PRIMEIRA_E_SEGUNDA_PARCELAS = 2;

    void pagar(Fatura fatura, String emailCobranca, String... emailsAdicionais) {
        Objects.requireNonNull(fatura, "Informe a fatura.");
        Objects.requireNonNull(emailCobranca, "Informe o e-mail de cobrança.");

        System.out.printf("Fatura %d, no valor total de R$ %.2f, foi paga!%n",
                fatura.numero, fatura.valorTotal);

        enviarNotificacao(fatura, emailCobranca);

        for (String email : emailsAdicionais) {
            enviarNotificacao(fatura, email);
        }
    }

    double calcularMediaDasParcelasPagas(double primeiraParcela, double segundaParcela, double... parcelasRestantes) {
        if (primeiraParcela <= 0) {
            throw new IllegalArgumentException("Informe o valor pago da primeira parcela.");
        }
        if (segundaParcela <= 0) {
            throw new IllegalArgumentException("Informe o valor pago da segunda parcela.");
        }

        double totalPago = this.calcularSomaDasParcelas(primeiraParcela, segundaParcela);
        totalPago += this.calcularSomaDasParcelas(parcelasRestantes);

        return totalPago / this.calcularQuantidadeDeParcelas(parcelasRestantes);
    }

    private static int calcularQuantidadeDeParcelas(double[] parcelasRestantes) {
        return PRIMEIRA_E_SEGUNDA_PARCELAS + parcelasRestantes.length;
    }

    private double calcularSomaDasParcelas(double... parcelas) {
        double total = 0;
        for (double parcela : parcelas) {
           total += parcela;
        }
        return total;
    }

    private void enviarNotificacao(Fatura fatura, String email) {
        System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
    }
}