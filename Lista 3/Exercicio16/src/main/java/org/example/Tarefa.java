package org.example;

public class Tarefa {
    private int projeto;
    private String descricao;

    public Tarefa(int projeto, String descricao) {
        this.projeto = projeto;
        this.descricao = descricao;
    }

    public int getProjeto() {
        return projeto;
    }

    public String getDescricao() {
        return descricao;
    }
}

