package org.example;

public class Circulo extends FormaGeometrica{

    private double raio;

    public Circulo(double raio){
        if(raio<= 0){
            throw new IllegalArgumentException("O raio deve ser menor que 0");
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio<=0){
            throw new IllegalArgumentException("O raio deve ser menor que 0");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (raio *raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2* Math.PI *raio;
    }
}
