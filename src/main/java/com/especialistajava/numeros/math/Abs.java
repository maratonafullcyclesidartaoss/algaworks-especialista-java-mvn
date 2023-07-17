package com.especialistajava.numeros.math;

public class Abs {

    public static void main(String[] args) {
        float x = -100.5f;
        float y = 100.5f;

        float z = Math.abs(x);
        System.out.println("z: " + z);

        float k = Math.abs(y);
        System.out.println("k: " + k);
    }
}
