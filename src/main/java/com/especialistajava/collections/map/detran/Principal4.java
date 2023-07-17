package com.especialistajava.collections.map.detran;

import com.especialistajava.collections.map.detran.model.Carro;
import com.especialistajava.collections.map.detran.model.Proprietario;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Principal4 {

    public static void main(String[] args) {
        Proprietario maria = new Proprietario("Maria", "502.337.100-00");
        Proprietario ana = new Proprietario("Ana", "759.019.120-55");
        Proprietario jose = new Proprietario("José", "932.166.310-01");
        Proprietario joao = new Proprietario("João", "225.674.320-94");

        Carro bmw = new Carro("ALG1A23", "BMW X3");
        Carro honda = new Carro("WOR9K87", "Honda HR-V");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

        Map<Carro, Proprietario> proprietarios = new TreeMap<>();
        proprietarios.put(bmw, maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porsche, maria);

//        proprietarios.put(porsche, jose);

//        proprietarios.remove(ford);

        imprimirProprietarios(proprietarios);
    }

    private static void imprimirProprietarios(Map<Carro, Proprietario> proprietarios) {
        for (Carro carro : proprietarios.keySet()) {
            Proprietario proprietario = proprietarios.get(carro);
            System.out.printf("%s (%s) = %s%n", carro.getPlaca(),
                carro.getModelo(), proprietario.getNome());
        }
    }
}
