package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Atleta> listaAtleta = new ArrayList<>();
        listaAtleta.add(new Atleta("Joao Victor", 8));
        listaAtleta.add(new Atleta("Maria Silva", 9));
        listaAtleta.add(new Atleta("Carlos Souza", 7));
        listaAtleta.add(new Atleta("Ana Paula", 10));
        listaAtleta.add(new Atleta("Lucas Mendes", 6));
        listaAtleta.add(new Atleta("Fernanda Lima", 8));
        listaAtleta.add(new Atleta("Ricardo Alves", 5));
        listaAtleta.add(new Atleta("Beatriz Santos", 9));
        listaAtleta.add(new Atleta("Pedro Henrique", 7));
        listaAtleta.add(new Atleta("Juliana Costa", 10));
        listaAtleta.add(new Atleta("Gustavo Rocha", 6));

        List<Atleta> lista5MaioresAtletas = listaAtleta
                .stream()
                .sorted(Comparator.comparingInt(Atleta::getPontuacao).reversed())
                .limit(5)
                .collect(Collectors.toList());

        lista5MaioresAtletas.forEach(System.out::println);
    }
}