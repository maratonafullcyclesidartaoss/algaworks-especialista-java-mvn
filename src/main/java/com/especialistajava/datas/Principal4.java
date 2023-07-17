package com.especialistajava.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal4 {

    public static void main(String[] args) throws ParseException {
        String dataTexto = "30/12/2023 10:20:45";

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = format.parse(dataTexto);

        System.out.println(data);

    }
}
