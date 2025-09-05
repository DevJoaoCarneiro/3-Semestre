package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Exercicio 1
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Mariana", 32, LocalDate.of(2024, 5, 25)));
        clientes.add ( new Cliente("Robson", 54, LocalDate.of(2020, 3, 15)));
        clientes.add ( new Cliente("Amanda", 14, LocalDate.of(2019, 2, 13)));
        clientes.add ( new Cliente("Dyvin", 65, LocalDate.of(2014, 10, 1)));
        clientes.add ( new Cliente("Gabriel", 87, LocalDate.of(2025, 1,8)));
        clientes.add ( new Cliente("Joao Cleber", 72, LocalDate.of(2024, 12, 17)));

        List<Cliente> idadeMaiorQue30 = clientes
                .stream()
                .filter(c-> c.getIdade()>30)
                .collect(Collectors.toList());


        System.out.println(idadeMaiorQue30);


        //Exercicio 2

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Alice Silva", 34, 5500.00, "Recursos Humanos"));
        funcionarios.add(new Funcionario("Bruno Costa", 28, 3200.50, "Tecnologia da Informação"));
        funcionarios.add(new Funcionario("Carla Oliveira", 45, 4900.00, "Financeiro"));
        funcionarios.add(new Funcionario("Daniel Martins", 31, 4800.75, "Marketing"));
        funcionarios.add(new Funcionario("Eduarda Ferreira", 25, 6100.00, "Tecnologia da Informação"));
        funcionarios.add(new Funcionario("Fábio Souza", 52, 12500.00, "Diretoria"));
        funcionarios.add(new Funcionario("Gabriela Pereira", 39, 5950.00, "Vendas"));

        List<Funcionario> funcionarioMaiorQue5000 = funcionarios
                .stream()
                .filter(c-> c.getSalario()>5000)
                .sorted(Comparator.comparing(Funcionario::getSalario).reversed())
                .collect(Collectors.toList());

        funcionarioMaiorQue5000.forEach(System.out::println);

        //Exercicio 3
        List<Cliente> dataCadastroMaiorQue5anos = clientes.stream().filter(c-> c.getTempoCadastro()>5).collect(Collectors.toList());

        for(Cliente data : dataCadastroMaiorQue5anos){
            System.out.println(data+"\nData Cadastro..:"+data.getDataCadastro());
        }

        //Exercicio 4

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Caneta", 50, 2.50));
        produtos.add(new Produto("Caderno", 30, 15.00));
        produtos.add(new Produto("Borracha", 100, 1.20));
        produtos.add(new Produto("Lápis", 80, 1.50));
        produtos.add(new Produto("Mochila", 20, 120.00));
        produtos.add(new Produto("Agenda", 25, 35.00));
        produtos.add(new Produto("Estojo", 40, 25.00));
        produtos.add(new Produto("Apontador", 60, 3.00));
        produtos.add(new Produto("Marcador", 35, 4.50));
        produtos.add(new Produto("Tesoura", 15, 12.00));
        produtos.add(new Produto("Nankin", 0, 50.00));

        List<Produto> verificaEstoque = produtos
                .stream()
                .filter(c -> c.getQtdeEstoque()>0)
                .sorted(Comparator.comparingDouble(Produto::getPrecoDoProduto))
                .collect(Collectors.toList());

        verificaEstoque.forEach(System.out::println);

        //Exercicio 5
        Map<String, List<Funcionario>> funcionariosCompany = funcionarios
                .stream()
                .filter(c->c.getSalario()> 2000 && c.getSalario()<5000)
                .collect(Collectors.groupingBy(Funcionario::getDepartamento));

        System.out.println("Funcionários com salário entre R$ 2000 e R$ 5000 agrupados por departamento:\n");

        for(Map.Entry<String, List<Funcionario>> entry: funcionariosCompany.entrySet()){
            System.out.println("Departamento..:"+entry.getKey());
            for(Funcionario f: entry.getValue()){
                System.out.println(" - " + f.getNome() + " | Salário: R$ " + f.getSalario());
            }
            System.out.println();
        }
    }


}