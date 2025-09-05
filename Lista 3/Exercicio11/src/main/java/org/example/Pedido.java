package org.example;

public class Pedido {
    private int id;
    private double valor;
    private String nomeProduto;

    public Pedido(int id, double valor, String nomeProduto) {
        this.id = id;
        this.valor = valor;
        this.nomeProduto = nomeProduto;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
}
