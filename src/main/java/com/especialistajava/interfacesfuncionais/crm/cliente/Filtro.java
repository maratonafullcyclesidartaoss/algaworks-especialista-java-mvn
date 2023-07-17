package com.especialistajava.interfacesfuncionais.crm.cliente;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);
}
