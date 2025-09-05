package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Desenvolvedor();
        Funcionario funcionario1 = new Designer();

        funcionario.baterPonto();
        funcionario1.baterPonto();
    }
}