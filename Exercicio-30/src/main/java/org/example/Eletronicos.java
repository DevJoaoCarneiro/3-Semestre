package org.example;

public class Eletronicos extends Estoque {

    @Override
    public void atualizarQuantidade(int quantidade) {
        setQuantidade(quantidade+getQuantidade());
    }

    @Override
    public String toString() {
        return "Eletrônico: Quantidade em estoque: " + getQuantidade();
    }
}
