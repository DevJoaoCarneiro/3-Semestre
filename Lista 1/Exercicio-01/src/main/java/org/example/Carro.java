package org.example;

public class Carro extends Veiculo{

    public Carro(String cor) {
        super(cor);
    }

    @Override
    public void mover() {
        System.out.println("Vrum Vrum");
    }
}
