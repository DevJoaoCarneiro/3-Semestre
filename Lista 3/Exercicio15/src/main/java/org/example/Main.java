package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Filme> listaFilme = new ArrayList<>();

        listaFilme.add(new Filme("Star is born", "Musical", 2024));
        listaFilme.add(new Filme("The Batman", "Ação", 2022));
        listaFilme.add(new Filme("Encanto", "Animação", 2021));
        listaFilme.add(new Filme("Duna", "Ficção Científica", 2023));
        listaFilme.add(new Filme("Parasita", "Suspense", 2019));
        listaFilme.add(new Filme("Interestelar", "Ficção Científica", 2014));
        listaFilme.add(new Filme("Coringa", "Drama", 2019));
        listaFilme.add(new Filme("Homem-Aranha: No Aranhaverso", "Animação", 2018));
        listaFilme.add(new Filme("Vingadores: Ultimato", "Ação", 2019));
        listaFilme.add(new Filme("O Poderoso Chefão", "Crime", 1972));
        listaFilme.add(new Filme("Titanic", "Romance", 1997));

        Map<String, List<Filme>> listaTitulo = listaFilme
                .stream()
                .collect(Collectors.groupingBy(Filme::getTitulo));

        System.out.println("Titulo");
        listaTitulo.forEach((genero,filme) -> {
            System.out.println("Genero.."+genero);
            filme.forEach(c-> System.out.println(" "+c.getTitulo()));
        });

        Map<Integer, List<Filme>> ListaPorAno = listaFilme
                .stream()
                .collect(Collectors.groupingBy(Filme::getAno));

        System.out.println("Ano");
        ListaPorAno.forEach((ano, filme)->{
            filme.forEach(c-> System.out.println(" "+c.getTitulo()));
            System.out.println("Ano.."+ano);
        });
    }
}