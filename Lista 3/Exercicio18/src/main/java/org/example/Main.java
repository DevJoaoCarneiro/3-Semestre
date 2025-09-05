package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Item> listaItem = new ArrayList<>();

        listaItem.add(new Item("Leite", 2));
        listaItem.add(new Item("Pão", 5));
        listaItem.add(new Item("Arroz", 1));
        listaItem.add(new Item("Feijão", 2));
        listaItem.add(new Item("Macarrão", 3));
        listaItem.add(new Item("Café", 1));
        listaItem.add(new Item("Açúcar", 2));
        listaItem.add(new Item("Óleo", 1));
        listaItem.add(new Item("Manteiga", 1));
        listaItem.add(new Item("Queijo", 2));
        listaItem.add(new Item("Presunto", 3));

        String itemConcatenado = listaItem
                .stream()
                .map(c-> "[" + c.getQuantidade()+ " "+ c.getNome() + "]")
                .collect(Collectors.joining("-"));
        System.out.println(itemConcatenado);
    }
}