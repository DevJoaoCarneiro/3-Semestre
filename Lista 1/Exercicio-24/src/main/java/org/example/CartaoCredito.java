package org.example;

import java.util.Date;

public class CartaoCredito extends Cartao {
    private Date dataVencimento;

    public CartaoCredito(double limite, String nomeCliente, Date dataVencimento) {
        super(limite, nomeCliente);
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "Nome .."+getNomeCliente()+"\nLimite Credito.."+getLimite()+"\nData Vencimento.."+dataVencimento;
    }
}
