package com.especialistajava.serializacaodeobjetos;

import java.io.Serial;
import java.io.Serializable;

public class Endereco implements Serializable {

    @Serial
    private static final long serialVersionUID = 4256471607937490852L;

    private String rua;
    private String numero;
    private String bairro;

    public Endereco(String rua, String numero, String bairro) {
        if (rua == null || rua.isBlank()) {
            throw new IllegalArgumentException("Informe a rua.");
        }
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Informe o número.");
        }
        if (bairro == null || bairro.isBlank()) {
            throw new IllegalArgumentException("Informe o bairro.");
        }
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
            "rua='" + rua + '\'' +
            ", numero='" + numero + '\'' +
            ", bairro='" + bairro + '\'' +
            '}';
    }
}
