package org.padroes.factoryMethod;

public class EntregaRapida implements IEntrega {
    @Override
    public String realizarEntrega() {
        return "Entrega rápida realizada!";
    }

    @Override
    public double calcularCusto() {
        return 20.0;
    }
}
