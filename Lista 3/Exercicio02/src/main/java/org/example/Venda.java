package org.example;

public class Venda {
    private String valor;
    private String nome;

    public Venda(String valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
