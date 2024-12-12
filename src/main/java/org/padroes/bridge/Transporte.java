package org.padroes.bridge;

public abstract class Transporte {

    protected Tarifa tarifa;

    public Transporte(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public abstract double calcularTarifa(double distancia);
}