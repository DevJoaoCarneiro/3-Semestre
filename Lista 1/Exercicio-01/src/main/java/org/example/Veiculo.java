package org.example;

public abstract class Veiculo {
    private String cor;

    public Veiculo(String cor) {
        if(cor.trim().isEmpty()){
            throw new IllegalArgumentException("A cor não pode ser vazia");
        }
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if(cor.trim().isEmpty()){
            throw new IllegalArgumentException("A cor não pode ser vazia");
        }
        this.cor = cor;
    }

    public void mostrarCor() {
        System.out.println("A cor do veiculo e..."+cor);
    }

    public abstract void mover();
}
