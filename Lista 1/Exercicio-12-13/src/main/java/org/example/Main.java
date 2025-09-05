package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("Jorge",5000);
        Funcionario funcionario2 = new Gerente("Marcia",9000);
        Funcionario funcionario3 = new Gerente("Rodrigo",4540);
        Funcionario funcionario4 = new Gerente("Tales",1540);

        funcionario.listarFuncionario();

        funcionario.calcularBonificacao(20);


    }
}