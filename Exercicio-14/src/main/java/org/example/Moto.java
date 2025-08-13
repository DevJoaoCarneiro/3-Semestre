package org.example;

public class Moto extends Transporte{

    @Override
    public void velocidadeMaxima() {
        setVelocidadeMaxima(120);
        System.out.println("A velocidade maxima e de "+getVelocidadeMaxima()+" km/h");
    }
}
