package org.example;

public class Transacao {
    private String descricao;
    private double valor;

    public Transacao(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
