package com.especialistajava.mergulhandoorientacaoobjetos;

public class PrincipalSalarioDevido {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Sidarta Silva";
        funcionario.quantidadeFilhos = 1;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        double valorHoraNormal = 50;
        double valorHoraExtra = valorHoraNormal * 1.5;
        contratoTrabalho.valorHoraNormal = valorHoraNormal;
        contratoTrabalho.valorHoraExtra = valorHoraExtra;
        contratoTrabalho.funcionario = funcionario;

        int quantidadePadraoHorasDia = 8;
        int quantidadeDiasMes = 21;
        int quantidadeHorasNormais = quantidadePadraoHorasDia * quantidadeDiasMes;

        int quantidadeHorasExtrasDia = 2;
        int quantidadeHorasExtras = quantidadeHorasExtrasDia * quantidadeDiasMes;

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        Holerite holerite = folhaPagamento.calcularSalario(quantidadeHorasNormais, quantidadeHorasExtras, contratoTrabalho);

        holerite.imprimir();
    }
}
