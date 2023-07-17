package com.especialistajava.optional.ciaaerea;

import java.util.Optional;
import java.util.OptionalInt;

public class Principal7 {

    public static void main(String[] args) {
        OptionalInt resultadoOptional = dividir(10, 2);

        resultadoOptional.ifPresentOrElse(
            r -> System.out.println("Resultado: " + r),
            () -> System.out.println("Sem resultado."));
    }

    private static OptionalInt dividir(int x, int y) {
        if (y == 0) return OptionalInt.empty();
        return OptionalInt.of(x / y);
    }
}
