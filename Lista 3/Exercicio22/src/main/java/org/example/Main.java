package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> listaPessoa = new ArrayList<>();
        listaPessoa.add(new Pessoa("João Victor", 24));
        listaPessoa.add(new Pessoa("Maria Clara", 26));
        listaPessoa.add(new Pessoa("Lucas Silva", 22));
        listaPessoa.add(new Pessoa("Ana Beatriz", 29));
        listaPessoa.add(new Pessoa("Carlos Eduardo", 31));
        listaPessoa.add(new Pessoa("Fernanda Souza", 28));
        listaPessoa.add(new Pessoa("Pedro Henrique", 21));
        listaPessoa.add(new Pessoa("Juliana Mendes", 27));
        listaPessoa.add(new Pessoa("Rafael Santos", 23));
        listaPessoa.add(new Pessoa("Camila Oliveira", 25));

        Map<Integer, List<String>> listaIdade = listaPessoa
                .stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getIdade,
                        Collectors.mapping(Pessoa::getNome, Collectors.toList())
                ));

        listaIdade.forEach((idade, nomes) ->
                System.out.println(idade + " anos -> " + nomes)
        );

    }
}