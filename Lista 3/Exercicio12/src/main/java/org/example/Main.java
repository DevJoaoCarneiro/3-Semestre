package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Pessoa> listaPessoa = new ArrayList<>();
        listaPessoa.add(new Pessoa("Joao Victor", 22));
        listaPessoa.add(new Pessoa("Maria Clara", 19));
        listaPessoa.add(new Pessoa("Pedro Henrique", 25));
        listaPessoa.add(new Pessoa("Ana Beatriz", 21));
        listaPessoa.add(new Pessoa("Lucas Gabriel", 30));
        listaPessoa.add(new Pessoa("Fernanda Souza", 27));
        listaPessoa.add(new Pessoa("Gustavo Lima", 24));
        listaPessoa.add(new Pessoa("Camila Rocha", 20));
        listaPessoa.add(new Pessoa("Ricardo Mendes", 35));
        listaPessoa.add(new Pessoa("Larissa Oliveira", 28));
        listaPessoa.add(new Pessoa("Thiago Ferreira", 26));

        List<ResumoPessoa> conversaoLista = listaPessoa
                .stream()
                .map(c-> new ResumoPessoa(c.getNome(),c.getIdade()))
                .collect(Collectors.toList());

        conversaoLista.forEach(System.out::println);

    }
}