package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personagem mago = new Mago();
        Personagem guerreiro = new Guerreiro();
        Random random = new Random();
        int num;
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("1- Mago -- 2- Guerreiro");
        int opcao = scanner.nextInt();

        Personagem jogador = (opcao == 1) ? mago : guerreiro;

        do {
            num = random.nextInt(1,20);
            if (contador % 2 == 0) {
                mago.atacar(guerreiro);
                if (num > 15)
                    mago.usarHabilidadeEspecial(guerreiro);

            } else {
                guerreiro.atacar(mago);
                if (num > 15)
                    mago.usarHabilidadeEspecial(guerreiro);
            }
            contador++;

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while (mago.getVida() > 0 && guerreiro.getVida() > 0);

        if (jogador.getVida() > 0) {
            System.out.println("🎉 Você ganhou!");
        } else {
            System.out.println("💀 Você perdeu!");
        }


    }
}