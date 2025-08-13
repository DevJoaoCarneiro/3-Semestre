package org.example;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Vermelho");
        Veiculo bicicleta = new Bicicleta("Azul");

        carro.mostrarCor();
        carro.mover();
        bicicleta.mostrarCor();
        bicicleta.mover();
    }
}