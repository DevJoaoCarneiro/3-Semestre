package org.example;

public class Cubo extends Forma3D{

    @Override
    public double calcularVolume(double valor) {
        return Math.pow(valor,3);
    }
}
