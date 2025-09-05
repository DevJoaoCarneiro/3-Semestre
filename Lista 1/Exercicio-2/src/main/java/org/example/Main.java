package org.example;

public class Main {
    public static void main(String[] args) {

        InstrumentoMusical piano = new Piano();
        InstrumentoMusical guitarra = new Guitarra();

        piano.tocar();
        piano.afinar();
        guitarra.tocar();
        guitarra.afinar();
    }
}