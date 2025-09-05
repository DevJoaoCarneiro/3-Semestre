package org.example;

public class Venda {
    private String produto;
    private double valor;

    public Venda(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }
}
