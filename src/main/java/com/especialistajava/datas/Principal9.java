package com.especialistajava.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Principal9 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Data da primeira parcela: ");
        String dataPrimeiraParcela = scanner.nextLine();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = scanner.nextInt();

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatador.parse(dataPrimeiraParcela);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);

        System.out.println(CalculadoraParcelas.calcularParcelas(calendar, quantidadeParcelas));
    }
}
