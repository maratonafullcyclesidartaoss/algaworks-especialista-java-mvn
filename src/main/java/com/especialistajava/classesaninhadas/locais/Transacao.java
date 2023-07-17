package com.especialistajava.classesaninhadas.locais;

import java.math.BigDecimal;

public interface Transacao {

    BigDecimal getValorTotal();

    void reembolsar();
}
