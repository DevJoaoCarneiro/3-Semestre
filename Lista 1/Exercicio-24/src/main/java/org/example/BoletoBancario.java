package org.example;

public class BoletoBancario extends Cartao{
    public BoletoBancario(double limite, String nomeCliente) {
        super(limite, nomeCliente);
    }

    @Override
    public String toString() {
        return "Nome .."+getNomeCliente()+"\nGastos Credito.."+getLimite();
    }
}
