package com.especialistajava.optional.ciaaerea;

import java.util.Objects;
import java.util.Optional;

public class ServicoDeBagagem {

    private ServicoDeReserva servicoDeReserva;

    public ServicoDeBagagem(ServicoDeReserva servicoDeReserva) {
        Objects.requireNonNull(servicoDeReserva);
        this.servicoDeReserva = servicoDeReserva;
    }

    public void contratar(String codigoReserva, int quantidadeBagagens) {
        Objects.requireNonNull(codigoReserva);
        if (codigoReserva.isBlank()) {
            throw new IllegalArgumentException("Informe o código de reserva.");
        }
        if (quantidadeBagagens <= 0) {
            throw new IllegalArgumentException("Quantidade de bagagens inválida.");
        }
        Reserva reserva = this.servicoDeReserva.buscar(codigoReserva)
            .orElseThrow(() -> new ReservaNaoEncontradaException("Reserva não existe."));

        reserva.adicionarBagagens(quantidadeBagagens);
    }
}
