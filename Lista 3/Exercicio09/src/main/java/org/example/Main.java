package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<Tarefa> listaTarefa = new ArrayList<>();
        listaTarefa.add(new Tarefa("Lavar louça", true));
        listaTarefa.add(new Tarefa("Arrumar a cama", false));
        listaTarefa.add(new Tarefa("Estudar Java", true));
        listaTarefa.add(new Tarefa("Fazer exercícios físicos", false));
        listaTarefa.add(new Tarefa("Levar o lixo para fora", true));
        listaTarefa.add(new Tarefa("Pagar contas", false));
        listaTarefa.add(new Tarefa("Comprar mantimentos", true));
        listaTarefa.add(new Tarefa("Responder e-mails", false));
        listaTarefa.add(new Tarefa("Ler um capítulo de livro", true));
        listaTarefa.add(new Tarefa("Organizar arquivos do computador", false));
        listaTarefa.add(new Tarefa("Planejar a semana", true));

        List<Tarefa> tarefasConcluido = listaTarefa
                .stream()
                .filter(c->c.isConcluida()==true)
                .collect(Collectors.toList());

        System.out.println("Tarefas concluidas");
        tarefasConcluido.forEach(System.out::println);
    }
}