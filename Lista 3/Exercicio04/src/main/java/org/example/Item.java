package org.example;

public class Item {
    private String nome;
    private String categoria;

    public Item(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Nome Produto..:"+nome;
    }
}
