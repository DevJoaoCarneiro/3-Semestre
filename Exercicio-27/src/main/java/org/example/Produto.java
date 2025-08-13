package org.example;

public abstract class Produto {
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public abstract double calcularDesconto(double valor);
}
