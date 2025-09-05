package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(new Produto(1, "Joao Victor", "1.92.4"));
        listaProduto.add(new Produto(2, "Maria Clara", "2.1.0"));
        listaProduto.add(new Produto(3, "Lucas Silva", "3.5.7"));
        listaProduto.add(new Produto(4, "Ana Beatriz", "1.0.1"));
        listaProduto.add(new Produto(5, "Carlos Eduardo", "2.4.9"));
        listaProduto.add(new Produto(6, "Fernanda Souza", "4.3.2"));
        listaProduto.add(new Produto(7, "Pedro Henrique", "1.8.6"));
        listaProduto.add(new Produto(8, "Juliana Mendes", "3.9.0"));
        listaProduto.add(new Produto(9, "Rafael Santos", "5.0.0"));
        listaProduto.add(new Produto(10, "Camila Oliveira", "2.7.4"));
        listaProduto.add(new Produto(11, "Bruno Costa", "1.3.5"));

        Map<Integer, String> melhorVersao = listaProduto
                .stream()
                .collect(Collectors.toMap(
                        Produto::getId,
                        Produto::getVersao
                ));
        melhorVersao.forEach((id, versao)->{
            System.out.println("Id..."+id);
            System.out.println("Versao."+versao);
        });
    }
}