package org.example;

public class ContaPoupanca extends ContaBancaria{
    private double taxaJuros;

    public ContaPoupanca(String nome, double saldo, double taxaJuros) {
        super(nome, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public String toString() {
        return "Nome..."+getNome()+"\nSaldo.."+getSaldo()+"\nTaxa de juros.."+taxaJuros;
    }
}
