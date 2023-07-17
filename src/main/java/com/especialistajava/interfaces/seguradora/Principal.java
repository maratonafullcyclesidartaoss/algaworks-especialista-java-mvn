package com.especialistajava.interfaces.seguradora;

import com.especialistajava.interfaces.seguradora.modelo.Caminhao;
import com.especialistajava.interfaces.seguradora.modelo.CarroParticular;
import com.especialistajava.interfaces.seguradora.modelo.ImovelResidencial;
import com.especialistajava.interfaces.seguradora.servico.ServicoPropostaSeguro;

public class Principal {

    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        CarroParticular carro = new CarroParticular("HR-V", 150_000, 2022);
        Caminhao caminhao = new Caminhao("Actros", 780_000, 2021, 4);
        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);

        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovel);
    }
}
