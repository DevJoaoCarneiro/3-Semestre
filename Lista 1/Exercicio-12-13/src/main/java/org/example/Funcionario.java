package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    private double salario;
    private String nome;
    private static List<Funcionario> lista = new ArrayList<>();

    public Funcionario(String nome , double salario) {
        this.nome = nome;
        this.salario = salario;
        lista.add(this);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void calcularBonificacao(int taxaBonificacao);

    public void listarFuncionario(){
        for(Funcionario Listar : lista){
            System.out.println(Listar);
        }
    }

    @Override
    public String toString() {
        return "Funcionario {" +nome+
                "} salario=" + salario;

    }
}
