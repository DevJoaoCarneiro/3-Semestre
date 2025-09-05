package org.example;

public class Cliente {
    private String nome;
    private boolean ativo;

    public Cliente(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
