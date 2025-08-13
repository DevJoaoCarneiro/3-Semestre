package org.example;

public class ContaCorrente extends ContaBancaria{
    private String Cpf;


    public ContaCorrente(String nome, double saldo, String cpf) {
        super(nome, saldo);
        Cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome..."+getNome()+"\nSaldo.."+getSaldo()+"\nCpf...."+Cpf;
    }
}
