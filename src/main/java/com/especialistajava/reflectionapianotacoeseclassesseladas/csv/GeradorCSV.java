package com.especialistajava.reflectionapianotacoeseclassesseladas.csv;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeradorCSV {

    private GeradorCSV() {
    }

    public static <T> void imprimir(Class<T> clazz, List<T> objetos) {
//        System.out.println("codigo;nome;dataNascimento");
//        System.out.println(Arrays.toString(Cliente.class.getDeclaredFields()));
        Field[] propriedades = clazz.getDeclaredFields();

        System.out.println(Arrays.stream(propriedades)
            .filter(propriedade -> propriedade.isAnnotationPresent(Campo.class))
            .map(Field::getName)
            .collect(Collectors.joining(";")));
        objetos.forEach(GeradorCSV::imprimir);
    }

    private static <T> void imprimir(Object object) {
//        System.out.printf("%d;%s;%s%n", cliente.getCodigo(),
//            cliente.getNome(), cliente.getDataNascimento());
        Field[] propriedades = object.getClass().getDeclaredFields();
        List<String> valores = new ArrayList<>();
        for (Field propriedade : propriedades) {
            if (propriedade.isAnnotationPresent(Campo.class)) {
                Campo anotacaoCampo = propriedade.getAnnotation(Campo.class);
                try {
                    propriedade.setAccessible(true);
                    Object resultado = propriedade.get(object);
                    String resultadoString = resultado == null ? "" : resultado.toString();
                    valores.add(anotacaoCampo.maiusculo() ? resultadoString.toUpperCase() : resultadoString);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println(String.join(";", valores));
    }
}
