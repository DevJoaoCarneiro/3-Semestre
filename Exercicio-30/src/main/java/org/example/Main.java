package org.example;

public class Main {
    public static void main(String[] args) {

        Estoque Tshirts = new Roupas();
        Estoque computador = new Eletronicos();

        Tshirts.atualizarQuantidade(1000);
        computador.atualizarQuantidade(2000);

        System.out.println(Tshirts);
        System.out.println(computador);
    }
}