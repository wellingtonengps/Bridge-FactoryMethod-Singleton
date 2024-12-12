package org.padroes.factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaFactoryTest {

    @Test
    void deveRetornarExcecaoParaEntregaInexistente() {
        try {
            IEntrega servico = EntregaFactory.criarEntrega("SuperRapida");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Entrega inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEntregaInvalido() {
        try {
            IEntrega servico = EntregaFactory.criarEntrega("PAC");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Entrega inválida", e.getMessage());
        }
    }
}