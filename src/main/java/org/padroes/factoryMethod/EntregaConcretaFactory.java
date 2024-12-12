package org.padroes.factoryMethod;

public class EntregaConcretaFactory extends EntregaFactory {

    @Override
    public Entrega criarEntrega(String tipo) {
        switch (tipo) {
            case "Rápida":
                return new EntregaRapida();
            case "Econômica":
                return new EntregaEconomica();
            default:
                throw new IllegalArgumentException("Tipo de entrega inválido.");
        }
    }
}