package org.padroes.bridge;

public class TarifaCarro implements Tarifa {
    @Override
    public double calcular(double distancia) {
        return distancia * 3.0;
    }
}
