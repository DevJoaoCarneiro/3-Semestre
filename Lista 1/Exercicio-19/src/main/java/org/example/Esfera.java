package org.example;

public class Esfera extends Forma3D{


    @Override
    public double calcularVolume(double valor) {
        return (4.0/3.0)*Math.PI*Math.pow(valor,3);
    }
}
