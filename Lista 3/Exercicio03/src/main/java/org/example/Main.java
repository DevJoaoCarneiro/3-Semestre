package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<Produto> listaProduto = new ArrayList<>();

        listaProduto.add(new Produto("Leite", 5.50));
        listaProduto.add(new Produto("Pão", 3.20));
        listaProduto.add(new Produto("Café", 12.90));
        listaProduto.add(new Produto("Arroz", 22.30));
        listaProduto.add(new Produto("Feijão", 8.75));
        listaProduto.add(new Produto("Açúcar", 4.60));
        listaProduto.add(new Produto("Macarrão", 3.90));
        listaProduto.add(new Produto("Óleo", 7.10));
        listaProduto.add(new Produto("Sal", 2.00));
        listaProduto.add(new Produto("Farinha de Trigo", 5.25));

        List<Produto> listaValorAcima100 = listaProduto
                .stream()
                .filter(c-> c.getPreco() > 10)
                .collect(Collectors.toList());

        listaValorAcima100.forEach(System.out::println);


    }
}