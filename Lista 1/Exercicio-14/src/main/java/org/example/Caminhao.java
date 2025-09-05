package org.example;

public class Caminhao extends Transporte{

    @Override
    public void velocidadeMaxima() {
        setVelocidadeMaxima(100);
        System.out.println("A velocidade maxima e de "+getVelocidadeMaxima()+" km/h");
    }
}
