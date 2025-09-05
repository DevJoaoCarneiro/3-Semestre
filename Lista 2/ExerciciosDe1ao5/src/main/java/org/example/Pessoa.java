package org.example;

public abstract class Pessoa implements Entidade {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String toString() {
        return "\nNome...."+getNome()+"\nIdade...."+getIdade();
    }
}
