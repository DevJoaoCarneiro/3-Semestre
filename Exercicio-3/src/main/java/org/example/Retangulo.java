package org.example;

public class Retangulo extends FormaGeometrica {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        if(largura <= 0 || altura <= 0){
            throw new IllegalArgumentException("Valor precisa ser maior que 0");
        }
        this.largura = largura;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (largura <= 0) {
            throw new IllegalArgumentException("Largura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return largura*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(largura+altura);
    }
}
