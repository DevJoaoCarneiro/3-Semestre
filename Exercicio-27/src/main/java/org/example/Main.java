package org.example;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Alimento(500);
        Produto produto1 = new Eletronico(1000);

        System.out.println("O valor original e "+produto.getPreco()+" e com o desconto fica.."+produto.calcularDesconto(20));
        System.out.println("O valor original e "+produto1.getPreco()+" e com o desconto fica.."+produto1.calcularDesconto(10));
    }
}