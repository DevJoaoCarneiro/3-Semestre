package org.example;

public class Roupas extends Estoque{

    @Override
    public void atualizarQuantidade(int quantidade) {
        setQuantidade(quantidade+getQuantidade());
    }

    @Override
    public String toString() {
        return "Roupas: Quantidade em estoque: " + getQuantidade();
    }
}
