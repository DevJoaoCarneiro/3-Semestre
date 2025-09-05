package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Arquivo> listaArquivo = new ArrayList<>();

        listaArquivo.add(new Arquivo("Documento1", 1200));
        listaArquivo.add(new Arquivo("Documento2", 800));
        listaArquivo.add(new Arquivo("Apresentacao1", 2200));
        listaArquivo.add(new Arquivo("Slide1", 1800));
        listaArquivo.add(new Arquivo("Slide2", 900));
        listaArquivo.add(new Arquivo("Foto1", 500));
        listaArquivo.add(new Arquivo("Foto2", 1500));
        listaArquivo.add(new Arquivo("Musica1", 3000));
        listaArquivo.add(new Arquivo("Musica2", 3500));
        listaArquivo.add(new Arquivo("Musica3", 2800));

        Map<String, List<Arquivo>> top3PorExtensao = listaArquivo.stream()
                .collect(Collectors.groupingBy(
                        Arquivo::getNome,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                lista -> lista.stream()
                                        .sorted(Comparator.comparingLong(Arquivo::getTamanho).reversed())
                                        .limit(3)
                                        .collect(Collectors.toList())
                        )
                ));
        top3PorExtensao.forEach((extensao, lista) -> {
            System.out.println("Extensão: " + extensao);
            lista.forEach(System.out::println);
            System.out.println();
        });
    }
}