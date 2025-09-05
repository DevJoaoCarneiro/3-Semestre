package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> listaFuncionario = new ArrayList<>();
        listaFuncionario.add(new Funcionario("João Victor", "Area de Ti"));
        listaFuncionario.add(new Funcionario("Ana Paula", "Recursos Humanos"));
        listaFuncionario.add(new Funcionario("Carlos Eduardo", "Financeiro"));
        listaFuncionario.add(new Funcionario("Mariana Silva", "Marketing"));
        listaFuncionario.add(new Funcionario("Pedro Henrique", "Área de TI"));
        listaFuncionario.add(new Funcionario("Fernanda Lima", "Financeiro"));
        listaFuncionario.add(new Funcionario("Lucas Oliveira", "Logística"));
        listaFuncionario.add(new Funcionario("Juliana Costa", "Recursos Humanos"));
        listaFuncionario.add(new Funcionario("Ricardo Santos", "Comercial"));
        listaFuncionario.add(new Funcionario("Aline Rocha", "Marketing"));
        listaFuncionario.add(new Funcionario("Gustavo Almeida", "Logística"));

        Map<String, Long> listaPorDepartamento = listaFuncionario
                .stream()
                .collect(Collectors.groupingBy(
                        Funcionario::getDepartamento, Collectors.counting()));

        listaPorDepartamento.forEach((departamento, total)-> System.out.println("Departamento..."+departamento+"- Total:"+ total));
    }
}