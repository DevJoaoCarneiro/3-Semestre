package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Transacao> listaTransacao = new ArrayList<>();

        listaTransacao.add(new Transacao("Mercado", 350));
        listaTransacao.add(new Transacao("Padaria", 25));
        listaTransacao.add(new Transacao("Posto de Gasolina", 200));
        listaTransacao.add(new Transacao("Restaurante", 120));
        listaTransacao.add(new Transacao("Farmácia", 80));
        listaTransacao.add(new Transacao("Academia", 150));
        listaTransacao.add(new Transacao("Cinema", 60));
        listaTransacao.add(new Transacao("Loja de Roupas", 450));
        listaTransacao.add(new Transacao("Transporte Público", 15));
        listaTransacao.add(new Transacao("Lanchonete", 35));
        listaTransacao.add(new Transacao("Internet", 100));

        Transacao menorTransacao = listaTransacao.stream()
                .collect(Collectors.reducing(
                        listaTransacao.get(0),
                        (t1, t2) -> t1.getValor() < t2.getValor() ? t1 : t2
                ));

        System.out.println("A menor transacao e..." + menorTransacao);
    }
}