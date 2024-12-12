package org.padroes.bridge;

public class TransporteCarro extends Transporte {

    public TransporteCarro(Tarifa tarifa) {
        super(tarifa);
    }

    @Override
    public double calcularTarifa(double distancia) {
        return tarifa.calcular(distancia);
    }
}