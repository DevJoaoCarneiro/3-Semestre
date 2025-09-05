package org.example;

public class Funcionario extends Pessoa{
    private double salario;
    private String departamento;

    //Exercicio 5
    public Funcionario(String nome, int idade, double salario, String departamento) {
        super(nome, idade);
        this.salario = salario;
        this.departamento = departamento;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "\nNome...."+getNome()+"\nIdade...."+getIdade()+"\nSalario..."+getSalario();
    }
}
