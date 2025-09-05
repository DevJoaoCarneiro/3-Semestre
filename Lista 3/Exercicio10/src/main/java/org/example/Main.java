package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("Focus", 2020));
        listaCarro.add(new Carro("Civic", 2019));
        listaCarro.add(new Carro("Corolla", 2021));
        listaCarro.add(new Carro("Gol", 2018));
        listaCarro.add(new Carro("Onix", 2022));
        listaCarro.add(new Carro("Fiesta", 2017));
        listaCarro.add(new Carro("HB20", 2023));
        listaCarro.add(new Carro("Cruze", 2020));
        listaCarro.add(new Carro("Sandero", 2016));
        listaCarro.add(new Carro("Kwid", 2021));
        listaCarro.add(new Carro("T-Cross", 2022));

        List<Integer> anoFabricacao = listaCarro
                .stream()
                .map(c->c.getAno())
                .collect(Collectors.toList());

        anoFabricacao.forEach(System.out::println);
    }
}