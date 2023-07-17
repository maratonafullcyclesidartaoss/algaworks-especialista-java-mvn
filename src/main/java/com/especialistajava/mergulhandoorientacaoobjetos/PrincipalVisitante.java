package com.especialistajava.mergulhandoorientacaoobjetos;

public class PrincipalVisitante {

    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "Joao";
        novoVisitante.idade = 12;

/*        if (novoVisitante.possuiAcessoRestritoPorIdade()) {
            System.out.printf("Acesso não permitido para menores de %d anos%n", Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO);
        } else {
            System.out.println("Acesso liberado");
        }*/

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
//        cadastroPortaria.cadastrar(novoVisitante, 10);
        cadastroPortaria.cadastrar(novoVisitante, 2);
    }
}