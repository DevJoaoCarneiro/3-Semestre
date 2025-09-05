package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vetor> listaVetor = new ArrayList<>();

        listaVetor.add(new Vetor(4, 10));
        listaVetor.add(new Vetor(2, 5));
        listaVetor.add(new Vetor(7, 3));
        listaVetor.add(new Vetor(1, 8));
        listaVetor.add(new Vetor(6, 6));
        listaVetor.add(new Vetor(0, 0));
        listaVetor.add(new Vetor(9, 2));
        listaVetor.add(new Vetor(3, 7));
        listaVetor.add(new Vetor(5, 1));
        listaVetor.add(new Vetor(8, 4));

        Vetor somaTotal = listaVetor
                .stream()
                .reduce(new Vetor(0,0), Vetor::somar);

        System.out.println("Soma de todos os vetores: " + somaTotal);

    }
}