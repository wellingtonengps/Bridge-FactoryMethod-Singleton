package org.padroes.bridge;

public class Bicicleta extends Transporte {

    public Bicicleta(Tarifa tarifa) {
        super(tarifa);
    }

    @Override
    public double calcularTarifa(double distancia) {
        return tarifa.calcular(distancia);
    }
}