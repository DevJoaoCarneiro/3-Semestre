package org.example;

public class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        if(saldo>0){
            this.saldo = saldo;
        }else{
            throw new IllegalArgumentException("Saldo invalido");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double operacao) {
        if(operacao > 0 && operacao<= saldo){
            this.saldo -= operacao;
            System.out.println("Operacao realizada com sucesso");
        }else{
            throw new IllegalArgumentException("Operacao invalida infelizmente");
        }
    }

    public void depositar(double operacao) {
        if(operacao>0){
            this.saldo += operacao;
            System.out.println("Operacao realizada com sucesso");
        }else{
            throw new IllegalArgumentException("Operacao invalida infelizmente");
        }

    }
}



