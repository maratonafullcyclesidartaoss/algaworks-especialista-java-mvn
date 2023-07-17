package com.especialistajava.strings.examples.textblock;

public class Principal {

    public static void main(String[] args) {
        String nome = "João da Silva";
        String html;
        html = """
            <a href="mailto:joao@gmail.com">
                %s - joao@gmail.com</a>
            <a>
                abc@doe.com
            </a>
            <a>
                xyz@doe.com
            </a>
            <strong>maria@doe.com</strong>"""
            .formatted(nome);
        System.out.println(html);
    }
}
