package org.padroes.factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntregaRapidaTest {

    @Test
    void deveRealizarEntregaRapida() {
        IEntrega entrega = new EntregaRapida();
        assertEquals("Entrega rápida realizada!", entrega.realizarEntrega());
    }

    @Test
    void deveCalcularCustoEntregaRapida() {
        IEntrega entrega = new EntregaRapida();
        assertEquals(20.0, entrega.calcularCusto());
    }
}