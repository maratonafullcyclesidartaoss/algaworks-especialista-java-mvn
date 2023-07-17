package com.especialistajava.strings.examples.expressoesregulares;

public class Anonimizacao {

    public static void main(String[] args) {
        String html = "<a href=\"mailto:joao@gmail.com\">joao@gmail.com</a>" +
            "<a>abc@doe.com</a><a>xyz@doe.com</a>" +
            "<strong>maria@doe.com</strong>";

        // boolean valido = Pattern.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}", email);
        String regex = "[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}";
//        String novoHtml = html.replaceFirst(regex, "email@anonimizado");
        String novoHtml = html.replaceAll(regex, "email@anonimizado");
        System.out.println(novoHtml);

    }
}
