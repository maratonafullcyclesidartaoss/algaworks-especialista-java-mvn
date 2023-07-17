package com.especialistajava.lancandoexcecoes.anuncio.servico;

import com.especialistajava.lancandoexcecoes.anuncio.CadastroAnuncioException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {

    public static final String PATH = "/home/sidarta/Downloads/algaworks-especialista-java-mvn/src/main/java/com/especialistajava/lancandoexcecoes/anuncio/abc/";

    public void cadastrar(String codigo, String descricao) {
        Path arquivo = Path.of(PATH + codigo + ".txt");
        try {
            Files.writeString(arquivo, descricao);
        } catch (IOException ioe) {
//            System.out.println("Erro escrevendo arquivo. Ignorando...");
//            ioe.printStackTrace();
            throw new CadastroAnuncioException("Erro na escrita do arquivo de anúncio", ioe);
        }
    }
}
