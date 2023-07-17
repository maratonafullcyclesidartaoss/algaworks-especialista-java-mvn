package com.especialistajava.interfaces.contaspagar.servico;

import com.especialistajava.interfaces.pagamento.*;

import java.util.Objects;

public class ServicoContaPagar {

    private final MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        Objects.requireNonNull(metodoPagamento);
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {
//        MetodoPagamento pix = new Pix();
//        pix.pagar(documento);
//        MetodoPagamento transferencia = new Transferencia();
//        transferencia.pagar(documento);
        this.metodoPagamento.pagar(documento);
    }
}
