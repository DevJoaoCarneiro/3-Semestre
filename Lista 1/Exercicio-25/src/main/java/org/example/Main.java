package org.example;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Ebook();
        Livro livro2 = new LivroFisico();

        livro.abrir();
        livro2.abrir();
    }
}