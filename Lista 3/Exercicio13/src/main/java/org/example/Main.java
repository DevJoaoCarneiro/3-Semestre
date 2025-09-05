package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Cliente> listaCliente = new ArrayList<>();

        listaCliente.add(new Cliente("João Victor", true));
        listaCliente.add(new Cliente("Maria Clara", false));
        listaCliente.add(new Cliente("Pedro Henrique", true));
        listaCliente.add(new Cliente("Ana Beatriz", true));
        listaCliente.add(new Cliente("Lucas Gabriel", false));
        listaCliente.add(new Cliente("Fernanda Souza", true));
        listaCliente.add(new Cliente("Gustavo Lima", false));
        listaCliente.add(new Cliente("Camila Rocha", true));
        listaCliente.add(new Cliente("Ricardo Mendes", false));
        listaCliente.add(new Cliente("Larissa Oliveira", true));
        listaCliente.add(new Cliente("Thiago Ferreira", true));


        List<Cliente> clientesAtivos = listaCliente
                .stream()
                .filter(c-> c.isAtivo()== true)
                .collect(Collectors.toList());

        clientesAtivos.forEach(System.out::println);
    }
}