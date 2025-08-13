package org.example;

public class Main {
    public static void main(String[] args) {

        FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica retangulo = new Retangulo(10, 5);

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

        System.out.println(retangulo.calcularPerimetro());
        System.out.println(retangulo.calcularArea());
    }
}