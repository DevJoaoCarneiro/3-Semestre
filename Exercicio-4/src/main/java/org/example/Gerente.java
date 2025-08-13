package org.example;

public class Gerente extends Funcionario{

    public Gerente(double salario){
        super(salario);
    }

    @Override
    public double calcularBonificacao() {
        return getSalario()*1.2;
    }

    @Override
    public double calcularSalario() {
        return getSalario() * 0.9;
    }
}
