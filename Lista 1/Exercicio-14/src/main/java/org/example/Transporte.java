package org.example;

public abstract class Transporte {
    private int velocidadeMaxima;

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public abstract void velocidadeMaxima();
}
