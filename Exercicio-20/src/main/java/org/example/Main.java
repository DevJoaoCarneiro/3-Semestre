package org.example;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Desktop();
        Computador notebook = new Notebook();

        computador.processar();
        notebook.processar();
    }
}