package org.padroes.singleton;

public class Configuracoes {

    private static Configuracoes instance = new Configuracoes();

    private String nomeEmpresa;
    private String entregadorAtual;

    private Configuracoes() {
    }

    public static Configuracoes getInstance() {
        return instance;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getEntregadorAtual() {
        return entregadorAtual;
    }

    public void setEntregadorAtual(String entregadorAtual) {
        this.entregadorAtual = entregadorAtual;
    }
}
