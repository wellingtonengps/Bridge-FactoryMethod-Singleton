package org.padroes.factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntregaEconomicaTest {

    @Test
    void deveRealizarEntregaEconomica() {
        IEntrega entrega = new EntregaEconomica();
        assertEquals("Entrega econômica realizada!", entrega.realizarEntrega());
    }

    @Test
    void deveCalcularCustoEntregaEconomica() {
        IEntrega entrega = new EntregaEconomica();
        assertEquals(10.0, entrega.calcularCusto());
    }
}