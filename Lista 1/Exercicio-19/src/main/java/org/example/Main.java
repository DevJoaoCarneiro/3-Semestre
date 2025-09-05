package org.example;

public class Main {
    public static void main(String[] args) {
        Forma3D circulo = new Esfera();
        Forma3D cubo = new Cubo();


        System.out.println("O volume da esfera do circulo..."+circulo.calcularVolume(2));
        System.out.println("O volume do cubo e de .........."+cubo.calcularVolume(10));
    }
}