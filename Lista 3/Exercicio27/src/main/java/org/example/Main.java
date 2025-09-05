package org.example;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Acesso> acessos = Arrays.asList(
                new Acesso("João", LocalDate.of(2024, 5, 10)),
                new Acesso("Maria", LocalDate.of(2024, 6, 12)),
                new Acesso("João", LocalDate.of(2024, 8, 1)),
                new Acesso("Maria", LocalDate.of(2024, 7, 20)),
                new Acesso("Pedro", LocalDate.of(2024, 1, 15)),
                new Acesso("João", LocalDate.of(2024, 9, 3)),
                new Acesso("Pedro", LocalDate.of(2024, 3, 25))
        );


        Map<String, Optional<Acesso>> ultimosAcessos = acessos.stream()
                .collect(Collectors.groupingBy(
                        Acesso::getUsuario,
                        Collectors.maxBy(Comparator.comparing(Acesso::getData))
                ));

        ultimosAcessos.forEach((usuario, acesso) ->
                System.out.println(usuario + " -> Último acesso: " +
                        acesso.map(Acesso::getData).orElse(null))
        );


    }
}