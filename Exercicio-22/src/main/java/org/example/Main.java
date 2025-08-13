package org.example;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaCorrente("Jorge", 2200, "10022323332");
        ContaBancaria conta2 = new ContaPoupanca("Marcia", 5000, 5.00);

        conta.sacar(1000);
        conta.depositar(1000);
        System.out.println(conta);

        conta2.sacar(4999);
        conta2.depositar(10000);
        System.out.println(conta2);

    }
}