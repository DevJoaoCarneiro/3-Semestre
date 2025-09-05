package org.example;

public class Main {
    public static void main(String[] args) {

       Jogo jogo1 = new JogoAventura();
       Jogo jogo2 = new JogoCorrida();
       jogo1.jogar();
       jogo2.jogar();
    }
}