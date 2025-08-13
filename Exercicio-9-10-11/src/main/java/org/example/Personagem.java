package org.example;

import java.util.Random;

public abstract class Personagem {
    private int vida;

    public Personagem() {
        vida = 100;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract void atacar(Personagem personagem);

    protected void usarHabilidadeEspecial(Personagem personagem) {
        Random random = new Random();
        int ataque = random.nextInt(10,30);
        System.out.println("Usando o ataque especial.."+ataque);
        personagem.setVida(personagem.getVida()- ataque);
        System.out.println("Vida do oponente agora.."+personagem.getVida()+"\n");
    }
}
