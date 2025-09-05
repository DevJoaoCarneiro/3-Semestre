package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Usuario> listaUsuario = new ArrayList<>();

        listaUsuario.add(new Usuario("Joao Victor", 1));
        listaUsuario.add(new Usuario("Ana Paula", 2));
        listaUsuario.add(new Usuario("Carlos Eduardo", 3));
        listaUsuario.add(new Usuario("Mariana Silva", 4));
        listaUsuario.add(new Usuario("Felipe Souza", 5));
        listaUsuario.add(new Usuario("Luciana Martins", 6));
        listaUsuario.add(new Usuario("Pedro Henrique", 7));
        listaUsuario.add(new Usuario("Juliana Rocha", 8));
        listaUsuario.add(new Usuario("Bruno Oliveira", 9));
        listaUsuario.add(new Usuario("Camila Alves", 10));
        listaUsuario.add(new Usuario("Renato Ferreira", 11));

        Map<Integer, String> listaMap = listaUsuario
                .stream()
                .collect(Collectors.toMap(Usuario::getId, Usuario::getNome));

        listaMap.forEach((chave, valor) ->
                System.out.println("Chave..." + chave + "Valor...:" + valor));
    }
}