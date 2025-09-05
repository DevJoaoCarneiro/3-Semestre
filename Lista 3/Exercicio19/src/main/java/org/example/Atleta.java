package org.example;

public class Atleta {
    private String nome;
    private int pontuacao;

    public Atleta(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return nome + " (" + pontuacao + ")";
    }
}
