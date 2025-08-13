package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Estagiario(1500);
        Funcionario funcionario2 = new Gerente(8000);

        System.out.println("Salario..."+funcionario1.calcularSalario());
        System.out.println("Salario..."+funcionario2.calcularSalario());



    }
}