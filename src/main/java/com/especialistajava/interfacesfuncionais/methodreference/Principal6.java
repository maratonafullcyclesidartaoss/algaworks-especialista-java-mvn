package com.especialistajava.interfacesfuncionais.methodreference;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.function.Predicate;

public class Principal6 {

    private static final NumberFormat FORMATADOR_MOEDA =
        NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal(19000), Funcionario.Status.ATIVO));
        funcionarios.add(new Funcionario("Maria", new BigDecimal(5000), Funcionario.Status.ATIVO));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal(13000), Funcionario.Status.ATIVO));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal(12000), Funcionario.Status.INATIVO));

        // remover funcionários inativos
//        Predicate<Funcionario> predicateInativo = funcionario -> funcionario.isInativo();
//        funcionarios.removeIf(predicateInativo);

//        funcionarios.removeIf(funcionario -> funcionario.isInativo());

        funcionarios.removeIf(Funcionario::isInativo);

        // ordenar funcionários pelo valor do salário
//        funcionarios.sort((funcionario1, funcionario2) -> funcionario1.getSalario().compareTo(funcionario2.getSalario()));
//        funcionarios.sort(Comparator.comparing(funcionario -> funcionario.getSalario()));
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario));

        // iterar e imprimir usando o método estático imprimir
        funcionarios.forEach(Principal6::imprimir);
    }

    private static void imprimir(Funcionario funcionario) {
        // implementar a impressão do nome, salário e impostos (20%)
        System.out.printf("%s -> (%s) (Salário Base) - (%s) (Impostos)%n",
            funcionario.getNome(),
            FORMATADOR_MOEDA.format(funcionario.getSalario()),
            FORMATADOR_MOEDA.format(
                funcionario.getSalario().multiply(new BigDecimal("0.2"))));
    }
}
