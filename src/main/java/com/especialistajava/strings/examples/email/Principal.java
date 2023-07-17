package com.especialistajava.strings.examples.email;

public class Principal {

    public static void main(String[] args) {
        String[] emailsValidos = {"joao@doe.com", "joao_silva@doe.com",
            "joao.silva@doe.com", "joao-silva@doe.com", "joao123@doe.com",
            "joao@doe123.com", "joao@java.com", "joao@doe-works.com",
            "joao@email.com", "joao@doe999.com"
        };

        String[] emailsInvalidos = { " joao@doe.com", "joao@doe.com ",
            "joao @doe.com", "joao@ doe.com", "joao@doe .com",
            "joao@doe .com", "joaodoe.com", "@doe.com",
            "joao@doe", "joao@doe.abcdef", "joao@doe@doe.com",
            "joao@doe.co1", "joao@DoE.com", "joao@doe.Com",
            "joao.com@doe", "joao@com", "joao@doe.",
            "jo#ao@doe.com", "joao@do#doe.com"
        };

        for (String email : emailsValidos) {
            if (!ValidadorEmail.validar(email)) {
                throw new RuntimeException(
                    String.format("E-mail %s é válido, mas validador retornou false", email)
                );
            }
        }

        for (String email : emailsInvalidos) {
            if (ValidadorEmail.validar(email)) {
                throw new RuntimeException(
                    String.format("E-mail %s é inválido, mas validador retornou true", email)
                );
            }
        }

        System.out.println("Sucesso! Validador funcionando corretamente.");
    }
}
