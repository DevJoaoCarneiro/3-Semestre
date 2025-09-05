package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Palavra> listaPalavra = new ArrayList<>();

        listaPalavra.add(new Palavra("Caderno"));
        listaPalavra.add(new Palavra("Caderno"));
        listaPalavra.add(new Palavra("Caneta"));
        listaPalavra.add(new Palavra("Lápis"));
        listaPalavra.add(new Palavra("Borracha"));
        listaPalavra.add(new Palavra("Caderno"));
        listaPalavra.add(new Palavra("Caneta"));
        listaPalavra.add(new Palavra("Estojo"));
        listaPalavra.add(new Palavra("Mochila"));
        listaPalavra.add(new Palavra("Livro"));
        listaPalavra.add(new Palavra("Lápis"));
        listaPalavra.add(new Palavra("Caderno"));
        listaPalavra.add(new Palavra("Régua"));
        listaPalavra.add(new Palavra("Caneta"));
        listaPalavra.add(new Palavra("Apontador"));
        listaPalavra.add(new Palavra("Livro"));
        listaPalavra.add(new Palavra("Caderno"));
        listaPalavra.add(new Palavra("Mochila"));
        listaPalavra.add(new Palavra("Borracha"));
        listaPalavra.add(new Palavra("Caderno"));
        listaPalavra.add(new Palavra("Caneta"));

        Map<String, Long> frequencia = listaPalavra.stream()
                .collect(Collectors.groupingBy(
                        Palavra::getTexto,
                        Collectors.counting()
                ));

        frequencia.forEach((palavra, qtd) ->
                System.out.println(palavra + " -> " + qtd)
        );
    }
}