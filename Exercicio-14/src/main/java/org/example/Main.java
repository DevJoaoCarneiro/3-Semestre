package org.example;

public class Main {
    public static void main(String[] args) {
        Transporte caminhao = new Caminhao();
        Transporte moto = new Moto();

        caminhao.velocidadeMaxima();
        moto.velocidadeMaxima();
    }
}