package com.especialistajava.herancainterfacesboaspraticas.locadora.modelo;

public class LocacaoPorDiaSeguroSantander extends LocacaoPorDia {

    public static final double VALOR_HORA_UTILIZADA = 0.5;
    public static final double PORCENTAGEM_SOBRE_VALOR_DO_CONTRATO_LOCACAO = 0.05;


    public LocacaoPorDiaSeguroSantander(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double valorDevido = super.calcularValorDevido(horasUtilizadas);
        valorDevido += calcularValorTotalHorasUtilizadas(horasUtilizadas) + calcularPorcentagemSobreValorDoContratoLocacao(valorDevido);
        return valorDevido;
    }

    private double calcularValorTotalHorasUtilizadas(int horasUtilizadas) {
        return horasUtilizadas * VALOR_HORA_UTILIZADA;
    }

    private double calcularPorcentagemSobreValorDoContratoLocacao(double valorDevido) {
        return valorDevido * PORCENTAGEM_SOBRE_VALOR_DO_CONTRATO_LOCACAO;
    }
}
