package org.example;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Venda> listaVenda = new ArrayList<>();
        listaVenda.add(new Venda("Caneta", 5.00));
        listaVenda.add(new Venda("Estojo", 87.00));
        listaVenda.add(new Venda("Mochila", 23.00));
        listaVenda.add(new Venda("Nankim", 6.60));
        listaVenda.add(new Venda("Borracha", 12.50));
        listaVenda.add(new Venda("Folha A4", 5.65));
        listaVenda.add(new Venda("Grafite", 2.65));

        Map<String, DoubleSummaryStatistics> listaFiltrada = listaVenda.stream()
                .collect(Collectors.groupingBy(Venda::getProduto, Collectors.summarizingDouble(Venda::getValor)));

        listaFiltrada.forEach((produto, venda)->{
            System.out.println("Produto..."+produto);
            System.out.println("Preco total....."+venda.getSum());
            System.out.printf("  - Valor Mínimo: R$ %.2f", venda.getMin());
            System.out.printf("  - Valor Máximo: R$ %.2f", venda.getMax());
            System.out.println("  - Quantidade de Vendas: " + venda.getCount());

        });
    }
}