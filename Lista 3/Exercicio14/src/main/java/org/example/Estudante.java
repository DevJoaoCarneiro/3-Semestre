package org.example;

public class Estudante {
    private String nome;
    private int nota;

    public Estudante(String nome, int nota) {
        this.nome = nome;
        if(nota<10 && nota >=0){
            this.nota = nota;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }
}
