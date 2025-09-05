package org.example;

public abstract class Cartao {
    private String nomeCliente;
    private double limite;

    public Cartao(double limite, String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.limite = limite;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getLimite() {
        return limite;
    }

    public void descontar(double valor) {
        if (valor > 0 && valor <= limite) {
            limite -= valor;
        } else {
            throw new IllegalArgumentException("Valor inválido para desconto.");
        }
    }
}
