package com.especialistajava.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculadoraParcelas {

    public static String calcularParcelas(Calendar dataPrimeiraParcela, int quantidadeParcelas) {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder(25);
        sb.append("Parcela #1 - ")
            .append(formatador.format(dataPrimeiraParcela.getTime()))
            .append("\n");
        for (int i = 1; i < quantidadeParcelas; i++) {
            Calendar proximoMes = Calendar.getInstance();
            proximoMes.setTime(dataPrimeiraParcela.getTime());
            proximoMes.add(Calendar.MONTH, i);
            int ultimoDiaMes = proximoMes.getActualMaximum(Calendar.DAY_OF_MONTH);
            proximoMes.set(Calendar.DAY_OF_MONTH, ultimoDiaMes);
            sb.append("Parcela #")
                .append(i + 1)
                .append(" - ")
                .append(formatador.format(proximoMes.getTime()))
                .append("\n");
        }
        return sb.toString();
    }
}
