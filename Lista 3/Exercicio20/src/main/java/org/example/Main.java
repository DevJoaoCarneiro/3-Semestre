package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Usuario> listaUsuario = new ArrayList<>();

        listaUsuario.add(new Usuario("Joao Victor", 20, "Barista"));
        listaUsuario.add(new Usuario("Maria Silva", 25, "Designer"));
        listaUsuario.add(new Usuario("Pedro Santos", 30, "Programador"));
        listaUsuario.add(new Usuario("Ana Costa", 28, "Médica"));
        listaUsuario.add(new Usuario("Lucas Oliveira", 22, "Estudante"));
        listaUsuario.add(new Usuario("Carla Mendes", 27, "Advogada"));
        listaUsuario.add(new Usuario("Rafael Souza", 35, "Professor"));
        listaUsuario.add(new Usuario("Fernanda Lima", 26, "Arquiteta"));
        listaUsuario.add(new Usuario("Gabriel Rocha", 24, "Engenheiro"));
        listaUsuario.add(new Usuario("Juliana Alves", 29, "Jornalista"));
        listaUsuario.add(new Usuario("Mateus Pereira", 21, "Analista de Dados"));

        Map<String, Usuario> mapaUsuarios = listaUsuario.stream()
                .collect(Collectors.toMap(
                        u -> u.getNome().toLowerCase().replace(" ", "_"), // chave personalizada
                        u -> u
                ));

        mapaUsuarios.forEach((chave, usuario) -> {
            System.out.println("Chave: " + chave + " -> " + usuario);
        });

    }
}