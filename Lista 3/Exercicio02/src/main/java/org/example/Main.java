package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Venda> listaVenda = new ArrayList<>();

        listaVenda.add(new Venda("200,00", "Camiseta polo"));
        listaVenda.add(new Venda("200,00", "Camiseta polo"));
        listaVenda.add(new Venda("150,00", "Calça jeans"));
        listaVenda.add(new Venda("90,00", "Boné esportivo"));
        listaVenda.add(new Venda("300,00", "Tênis de corrida"));
        listaVenda.add(new Venda("75,00", "Cinto de couro"));
        listaVenda.add(new Venda("120,00", "Camisa social"));
        listaVenda.add(new Venda("180,00", "Blusa de moletom"));
        listaVenda.add(new Venda("60,00", "Meia térmica"));
        listaVenda.add(new Venda("250,00", "Jaqueta jeans"));
        listaVenda.add(new Venda("95,00", "Shorts de banho"));

        List<Double> listaDouble = listaVenda
                .stream()
                .map(c-> Double.parseDouble(c.getValor().replace(",", ".")))
                .collect(Collectors.toList());

        listaDouble.forEach(System.out::println);
    }
}