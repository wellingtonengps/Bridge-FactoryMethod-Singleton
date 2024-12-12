package org.padroes.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracoesTest {

    @Test
    public void deveRetornarNomeEmpresa() {
        Configuracoes.getInstance().setNomeEmpresa("Empresa 1");
        assertEquals("Empresa 1", Configuracoes.getInstance().getNomeEmpresa());
    }

    @Test
    public void deveRetornarEntregadorAtual() {
        Configuracoes.getInstance().setEntregadorAtual("Entregador 1");
        assertEquals("Entregador 1", Configuracoes.getInstance().getEntregadorAtual());
    }
}