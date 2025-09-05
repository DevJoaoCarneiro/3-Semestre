package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("João", 2500),
                new Funcionario("Maria", 3200),
                new Funcionario("Pedro", 2800),
                new Funcionario("Ana", 4000),
                new Funcionario("Lucas", 1800),
                new Funcionario("Clara", 2200),
                new Funcionario("Rafael", 3500),
                new Funcionario("Fernanda", 2700)
        );

        double media = funcionarios.stream()
                .collect(Collectors.averagingDouble(Funcionario::getSalario));

        System.out.println("Média Salarial: R$" + media);
    }
}