package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Compra compra1 = new Compra(1, Arrays.asList(
                new Item("Arroz", 2),
                new Item("Feijão", 1),
                new Item("Macarrão", 3)
        ));

        Compra compra2 = new Compra(2, Arrays.asList(
                new Item("Arroz", 1),
                new Item("Feijão", 2),
                new Item("Café", 1)
        ));

        Compra compra3 = new Compra(3, Arrays.asList(
                new Item("Macarrão", 2),
                new Item("Café", 3),
                new Item("Açúcar", 1)
        ));

        List<Compra> listaCompras = Arrays.asList(compra1, compra2, compra3);


        Map<String, Long> itensAgrupados = listaCompras.stream()
                .flatMap(compra -> compra.getItens().stream())
                .collect(Collectors.groupingBy(
                        Item::getNome,
                        Collectors.counting()
                ));

        itensAgrupados.forEach((nome, qtd) ->
                System.out.println(nome + " -> " + qtd));
    }
}