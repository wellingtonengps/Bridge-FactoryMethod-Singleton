package org.padroes.bridge;

public class TarifaBicicleta implements Tarifa {
    @Override
    public double calcular(double distancia) {
        return distancia * 1.5;
    }
}