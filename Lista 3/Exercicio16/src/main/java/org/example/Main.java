package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Tarefa> listaTarefas = new ArrayList<>();
        listaTarefas.add(new Tarefa(1, "Criar layout"));
        listaTarefas.add(new Tarefa(2, "Implementar front-end"));
        listaTarefas.add(new Tarefa(3, "Configurar banco de dados"));
        listaTarefas.add(new Tarefa(4, "Criar tabelas"));
        listaTarefas.add(new Tarefa(5, "Planejar sprint"));
        listaTarefas.add(new Tarefa(6, "Reunião com equipe"));

        Map<Integer, Map<Integer,String>> mappingId = listaTarefas
                .stream()
                .collect(Collectors.groupingBy(Tarefa::getProjeto, Collectors.toMap(Tarefa::getProjeto, Tarefa::getDescricao)));

        mappingId.forEach((projetoId, mapa) -> {
            System.out.println("Projeto Id..."+projetoId);
            mapa.forEach((tarefa, descricao)->{
                System.out.println("Tarefa..."+tarefa);
                System.out.println("Descricao."+descricao);
            });
            System.out.println();
        });
    }
}