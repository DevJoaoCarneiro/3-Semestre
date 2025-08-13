package org.example;

public class Pagamento {
    private double valor;
    private StatusPagamento status;

    public Pagamento(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser positivo.");
        }
        this.valor = valor;
        this.status = StatusPagamento.PENDENTE;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public double getValor() {
        return valor;
    }

    private void aprovarPagamento(){
        this.status = StatusPagamento.APROVADO;
        System.out.println("Aprovado com sucesso");
    }

    public void realizarPagamento(Cartao cartao){
        if(valor <= cartao.getLimite()){
            cartao.descontar(valor);
            aprovarPagamento();
        }else{
            this.status = StatusPagamento.NEGADO;
            System.out.println("Pagamento negado. Saldo insuficiente.");
        }
    }
}
