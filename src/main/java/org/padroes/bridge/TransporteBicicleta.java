package org.padroes.bridge;

public class TransporteBicicleta extends Transporte {

    public TransporteBicicleta(Tarifa tarifa) {
        super(tarifa);
    }

    @Override
    public double calcularTarifa(double distancia) {
        return tarifa.calcular(distancia);
    }
}