package org.example;

public class Funcionario {
    private String nome;
    private int departamentoId;

    public Funcionario(String nome, int departamentoId) {
        this.nome = nome;
        this.departamentoId = departamentoId;
    }

    public String getNome() {
        return nome;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    @Override
    public String toString() {
        return nome;
    }
}
