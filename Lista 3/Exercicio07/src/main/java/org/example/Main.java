package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> listaPessoa = new ArrayList<>();

        listaPessoa.add(new Pessoa("Joao Victor"));
        listaPessoa.add(new Pessoa("Ana Clara"));
        listaPessoa.add(new Pessoa("Carlos Eduardo"));
        listaPessoa.add(new Pessoa("Mariana Lima"));
        listaPessoa.add(new Pessoa("Felipe Souza"));
        listaPessoa.add(new Pessoa("Luciana Martins"));
        listaPessoa.add(new Pessoa("Pedro Henrique"));
        listaPessoa.add(new Pessoa("Juliana Rocha"));
        listaPessoa.add(new Pessoa("Bruno Oliveira"));
        listaPessoa.add(new Pessoa("Camila Alves"));
        listaPessoa.add(new Pessoa("Renato Ferreira"));

        String nomeConcatenado = listaPessoa
                .stream()
                .map(c->c.getNome())
                .collect(Collectors.joining(", "));

        System.out.println(nomeConcatenado);
    }
}