package org.example;

public abstract class Estoque {
    private int quantidade;

    public Estoque() {
        quantidade = 0;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public abstract void atualizarQuantidade(int quantidade);

    @Override
    public String toString() {
        return "Estoque{" +
                "quantidade=" + quantidade +
                '}';
    }
}
