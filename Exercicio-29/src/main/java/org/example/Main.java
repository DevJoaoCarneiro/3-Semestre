package org.example;

public class Main {
    public static void main(String[] args) {

        Aula aula = new Matematica();
        Aula aula1 = new Portugues();

        aula1.ministrar();
        aula.ministrar();
    }
}