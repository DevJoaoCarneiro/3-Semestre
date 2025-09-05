package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Item> listaItem = new ArrayList<>();

        listaItem.add(new Item("Caneta", "Material"));
        listaItem.add(new Item("Lápis", "Material"));
        listaItem.add(new Item("Borracha", "Material"));
        listaItem.add(new Item("Caderno", "Material"));
        listaItem.add(new Item("Régua", "Material"));
        listaItem.add(new Item("Arroz", "Alimento"));
        listaItem.add(new Item("Feijão", "Alimento"));
        listaItem.add(new Item("Macarrão", "Alimento"));
        listaItem.add(new Item("Leite", "Alimento"));
        listaItem.add(new Item("Café", "Alimento"));
        listaItem.add(new Item("Sabão em pó", "Limpeza"));
        listaItem.add(new Item("Detergente", "Limpeza"));
        listaItem.add(new Item("Desinfetante", "Limpeza"));
        listaItem.add(new Item("Pilhas", "Eletrônicos"));
        listaItem.add(new Item("Vela", "Utilidades"));

        Map<String, List<Item>> listaPorCategoria = listaItem
                .stream()
                .collect(Collectors.groupingBy(Item::getCategoria));

        listaPorCategoria.forEach((categoria, itens) ->{
            System.out.println("Categoria.."+categoria);
            itens.forEach(item-> System.out.println(" -" +item));
            System.out.println();
        });
    }
}