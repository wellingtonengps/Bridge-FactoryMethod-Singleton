package org.padroes.factoryMethod;

public class EntregaEconomica implements IEntrega {
    @Override
    public String realizarEntrega() {
        return "Entrega econômica realizada!";
    }

    @Override
    public double calcularCusto() {
        return 10.0;
    }
}