package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Departamento> departamentos = Arrays.asList(
                new Departamento(1, "TI"),
                new Departamento(2, "RH"),
                new Departamento(3, "Financeiro")
        );

        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("João", 1),
                new Funcionario("Maria", 2),
                new Funcionario("Pedro", 1),
                new Funcionario("Ana", 3),
                new Funcionario("Lucas", 1),
                new Funcionario("Clara", 2)
        );


        Map<Departamento, List<Funcionario>> mapa = departamentos.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> funcionarios.stream()
                                .filter(f -> f.getDepartamentoId() == c.getId())
                                .collect(Collectors.toList())
                ));


        mapa.forEach((dept, funcs) -> {
            System.out.println("Departamento: " + dept.getNome());
            funcs.forEach(f -> System.out.println(" - " + f.getNome()));
            System.out.println();
        });
    }
}