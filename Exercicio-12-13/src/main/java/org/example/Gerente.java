package org.example;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonificacao(int taxaBonificacao) {
        setSalario(getSalario()+(getSalario()*taxaBonificacao)/100);
        System.out.println("Voce ganhou bonificacao de "+taxaBonificacao+"% Salario Atualizado.."+getSalario());
    }
}
