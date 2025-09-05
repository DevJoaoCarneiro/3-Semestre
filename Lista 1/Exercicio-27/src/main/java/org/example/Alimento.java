package org.example;

public class Alimento extends Produto{
    public Alimento(double preco) {
        super(preco);
    }

    @Override
    public double calcularDesconto(double valor) {
        return getPreco()+(getPreco()*valor)/100;
    }
}
