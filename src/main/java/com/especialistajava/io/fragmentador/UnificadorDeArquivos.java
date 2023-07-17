package com.especialistajava.io.fragmentador;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnificadorDeArquivos {

    private final File pastaArquivosFragmentados;
    private final File arquivoUnificado;
    private final String prefixoArquivosFragmentados;

    public UnificadorDeArquivos(File pastaArquivosFragmentados, File arquivoUnificado,
                                String prefixoArquivosFragmentados) {
        Objects.requireNonNull(pastaArquivosFragmentados);
        Objects.requireNonNull(arquivoUnificado);
        if (prefixoArquivosFragmentados == null || prefixoArquivosFragmentados.isBlank()) {
            throw new IllegalArgumentException("Informe o prefixo de arquivos fragmentados.");
        }
        this.pastaArquivosFragmentados = pastaArquivosFragmentados;
        this.arquivoUnificado = arquivoUnificado;
        this.prefixoArquivosFragmentados = prefixoArquivosFragmentados;
    }

    public File getPastaArquivosFragmentados() {
        return pastaArquivosFragmentados;
    }

    public File getArquivoUnificado() {
        return arquivoUnificado;
    }

    public String getPrefixoArquivosFragmentados() {
        return prefixoArquivosFragmentados;
    }

    public void unificar() throws IOException {
        List<File> arquivosFragmentados = listarArquivosFragmentados();
        this.ordenarArquivosFragmentados(arquivosFragmentados);
        this.escreverArquivoUnificado(arquivoUnificado, arquivosFragmentados);
    }

    private List<File> listarArquivosFragmentados() throws IOException {
        File[] arquivos = pastaArquivosFragmentados.listFiles((dir, nome) -> nome.startsWith(prefixoArquivosFragmentados + "."));
        if (arquivos == null || arquivos.length == 0) {
            throw new IOException("Não existem fragmentos com prefixo " + prefixoArquivosFragmentados +
                " na pasta " + pastaArquivosFragmentados.getAbsolutePath());
        }
        return Arrays.asList(arquivos);
    }

    private void ordenarArquivosFragmentados(List<File> arquivos) {
        Pattern padraoNumeroArquivoFragmentado = Pattern.compile("\\.(\\d+)");
        arquivos.sort(Comparator.comparing(arquivo -> {
            Matcher matcher = padraoNumeroArquivoFragmentado.matcher(arquivo.getName());
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
            throw new RuntimeException("Erro ordenando arquivos fragmentados");
        }));
    }

    private void escreverArquivoUnificado(File arquivoUnificado, List<File> arquivosFragmentados) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(arquivoUnificado)) {
            for (File arquivoFragmentado : arquivosFragmentados) {
                escreverFragmento(outputStream, arquivoFragmentado);
            }
        }
    }

    private void escreverFragmento(OutputStream outputStream, File arquivoFragmentado) throws IOException {
        try (InputStream inputStream = new FileInputStream(arquivoFragmentado)) {
            byte[] conteudo = new byte[1024];
            int quantidadeBytesLidos = 0;
            while ((quantidadeBytesLidos = inputStream.read(conteudo)) > 0) {
                outputStream.write(conteudo, 0, quantidadeBytesLidos);
            }
        }
    }
}
