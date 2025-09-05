package org.example;

public class Produto {
    private int id;
    private String nome;
    private String versao;

    public Produto(int id, String nome, String versao) {
        this.id = id;
        this.nome = nome;
        this.versao = versao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getVersao() {
        return versao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", versao='" + versao + '\'' +
                '}';
    }
}
