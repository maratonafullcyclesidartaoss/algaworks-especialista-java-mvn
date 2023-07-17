package com.especialistajava.interfacesfuncionais.crm;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class Principal5 {

    public static void main(String[] args) {
        IntPredicate predicate = num -> num > 10;
        System.out.println(predicate.test(10));

        IntFunction<String> function = num -> "Número " + num;
        System.out.println(function.apply(100));

        IntSupplier supplier = () -> 10;
        System.out.println(supplier.getAsInt());

        IntConsumer consumer = num -> System.out.println(num);
        consumer.accept(1000);
    }
}
