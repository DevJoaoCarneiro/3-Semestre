package org.example;

import java.util.Random;

public class Mago extends Personagem{

    public Mago() {
        super();
    }

    @Override
    public void atacar(Personagem oponente) {
        Random random = new Random();
        int ataque = random.nextInt(1,20);
        System.out.println("Mago atacando com forca.."+ataque);
        oponente.setVida(oponente.getVida() - ataque);
        System.out.println("Vida do oponente agora.."+oponente.getVida()+"\n");
    }

}
