package com.especialistajava.interfaces.pagamento;

public class Beneficiario {

    private String nome;
    private String chavePix;
    private String contaBancaria;

    public Beneficiario(String nome, String chavePix, String contaBancaria) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o nome.");
        }
        if (chavePix == null || chavePix.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe a chave Pix.");
        }
        if (contaBancaria == null || contaBancaria.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe a conta bancária.");
        }
        this.nome = nome;
        this.chavePix = chavePix;
        this.contaBancaria = contaBancaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public boolean naoPossuiChavePix() {
        return getChavePix() == null || getChavePix().trim().isEmpty();
    }

    public boolean naoPossuiContaBancaria() {
        return getContaBancaria() == null || getContaBancaria().trim().isEmpty();
    }
}
