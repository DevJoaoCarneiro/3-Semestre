package org.example;

public class Eletronico extends Produto {
    public Eletronico(double preco) {
        super(preco);
    }

    @Override
    public double calcularDesconto(double valor) {
        return getPreco()+(getPreco()*valor)/100;
    }
}
