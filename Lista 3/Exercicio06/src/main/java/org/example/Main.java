package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Transacao> listaTransacao = new ArrayList<>();

        listaTransacao.add(new Transacao(2500));
        listaTransacao.add(new Transacao(4344));
        listaTransacao.add(new Transacao(1220));
        listaTransacao.add(new Transacao(7680));
        listaTransacao.add(new Transacao(26650));
        listaTransacao.add(new Transacao(23320));
        listaTransacao.add(new Transacao(1222));
        listaTransacao.add(new Transacao(9879));
        listaTransacao.add(new Transacao(2220));
        listaTransacao.add(new Transacao(1987));
        listaTransacao.add(new Transacao(3232));

        double somatransacao = listaTransacao
                .stream()
                .collect(Collectors.summingDouble(Transacao::getValor));

        System.out.println("A soma de todos os valores: R$"+somatransacao);

    }
}