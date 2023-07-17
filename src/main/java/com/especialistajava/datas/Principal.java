package com.especialistajava.datas;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {
//        Date data = new Date(0);

        Date data = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1_000));
        System.out.println(data);


    }
}
