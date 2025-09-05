package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Pedido> listaPedido = new ArrayList<>();

        listaPedido.add(new Pedido(1, 220, "Teclado"));
        listaPedido.add(new Pedido(2, 150, "Mouse"));
        listaPedido.add(new Pedido(3, 350, "Monitor"));
        listaPedido.add(new Pedido(4, 80, "Cabo HDMI"));
        listaPedido.add(new Pedido(3, 1200, "Notebook"));
        listaPedido.add(new Pedido(6, 60, "Fone de Ouvido"));
        listaPedido.add(new Pedido(7, 450, "Impressora"));
        listaPedido.add(new Pedido(2, 300, "HD Externo"));
        listaPedido.add(new Pedido(9, 200, "Teclado Mecânico"));
        listaPedido.add(new Pedido(10, 100, "Mousepad"));
        listaPedido.add(new Pedido(1, 2500, "PC Gamer"));

        Map<Integer, Double> filtroID = listaPedido
                .stream()
                .collect(Collectors.groupingBy(Pedido::getId,
                        Collectors.summingDouble(Pedido::getValor)
                ));

        filtroID.forEach((id, preco)->{
            System.out.println("Id.."+id);
            System.out.println("Preco somado.."+preco);
            System.out.println();
        });
    }
}