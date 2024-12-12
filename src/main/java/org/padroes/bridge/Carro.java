package org.padroes.bridge;

public class Carro extends Transporte {

    public Carro(Tarifa tarifa) {
        super(tarifa);
    }

    @Override
    public double calcularTarifa(double distancia) {
        return tarifa.calcular(distancia);
    }
}