package org.example;

public class Estagiario extends Funcionario {
    public Estagiario(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario() * 0.95;
    }
}
