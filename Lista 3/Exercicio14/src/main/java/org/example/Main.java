package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Estudante> listaEstudante = new ArrayList<>();

        listaEstudante.add(new Estudante("Joao Victor", 8));
        listaEstudante.add(new Estudante("Maria Clara", 10));
        listaEstudante.add(new Estudante("Pedro Henrique", 7));
        listaEstudante.add(new Estudante("Ana Beatriz", 9));
        listaEstudante.add(new Estudante("Lucas Gabriel", 6));
        listaEstudante.add(new Estudante("Fernanda Souza", 5));
        listaEstudante.add(new Estudante("Gustavo Lima", 4));
        listaEstudante.add(new Estudante("Camila Rocha", 3));
        listaEstudante.add(new Estudante("Ricardo Mendes", 2));
        listaEstudante.add(new Estudante("Larissa Oliveira", 1));
        listaEstudante.add(new Estudante("Thiago Ferreira", 0));

        Double mediaNotas = listaEstudante
                .stream()
                .collect(Collectors.averagingDouble(Estudante::getNota));

        System.out.println("A media de nota e..."+mediaNotas);
    }
}