package org.padroes.factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntregaConcretaFactoryTest {

    @Test
    void deveRetornarEntregaValida() {
        Entrega entrega = EntregaConcretaFactory.obterEntrega("Expressa");
        assertEquals("Entrega Expressa processada", entrega.executar());
    }

    @Test
    void deveRetornarExcecaoParaEntregaInexistente() {
        try {
            Entrega entrega = EntregaConcretaFactory.obterEntrega("Aerea");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Entrega inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEntregaInvalida() {
        try {
            Entrega entrega = EntregaConcretaFactory.obterEntrega("Maritima");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Entrega inválida", e.getMessage());
        }
    }
}