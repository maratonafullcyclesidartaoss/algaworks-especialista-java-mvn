package com.especialistajava.herancainterfacesboaspraticas.locadora.modelo;

import java.util.Objects;

public abstract class Locacao {

    private Notebook notebook;

    public Locacao(Notebook notebook) {
        Objects.requireNonNull(notebook);
        this.notebook = notebook;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    public abstract double calcularValorDevido(int horasUtilizadas);
}
