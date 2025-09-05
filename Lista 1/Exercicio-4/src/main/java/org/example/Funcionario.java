package org.example;

public abstract class Funcionario {
    private double salario;

    public Funcionario(double salario){
        if(salario<= 0){
            throw new IllegalArgumentException("Salario precisa ser maior que 0");
        }
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void descansar(){
        System.out.println("Descansando...");
    }

    public double calcularBonificacao(){
        return 0;
    }

    public abstract double calcularSalario();
}
