package org.example;

public class Main {
    public static void main(String[] args) {
        AparelhoEletronico celular = new Celular();
        AparelhoEletronico tablet = new Tablet();

        celular.ligar();
        tablet.ligar();
    }
}