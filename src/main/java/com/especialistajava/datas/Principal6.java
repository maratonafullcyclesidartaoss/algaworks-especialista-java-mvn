package com.especialistajava.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Principal6 {

    public static void main(String[] args) throws ParseException {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Data de nascimento: ");
        String dataAniversarioTexto = scanner.nextLine();

        Date dataNascimento = formatador.parse(dataAniversarioTexto);

//        System.out.println(dataAniversario);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataNascimento);

//        System.out.println(calendar);

        System.out.println(calendar.getTime());

        if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER
            && calendar.get(Calendar.DAY_OF_MONTH) == 25) {
            System.out.println("Você nasceu no natal.");
        } else if (calendar.get(Calendar.DAY_OF_YEAR) == 256) {
            System.out.println("Você nasceu no dia do programador.");
        }


    }
}
