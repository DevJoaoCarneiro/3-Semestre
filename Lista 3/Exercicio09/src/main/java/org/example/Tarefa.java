package org.example;

public class Tarefa {
    private String titulo;
    private boolean concluida;

    public Tarefa(String titulo, boolean concluida) {
        this.titulo = titulo;
        this.concluida = concluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        return "Tarefa...:"+titulo;
    }
}
