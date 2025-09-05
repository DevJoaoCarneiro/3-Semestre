package org.example;

public class Bicicleta extends Veiculo{

    public Bicicleta(String cor) {
        super(cor);
    }


    @Override
    public void mover() {
        System.out.println("Trim Trim");
    }
}
