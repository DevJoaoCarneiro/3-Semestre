package org.example;

public class Main {
    public static void main(String[] args) {
        RedeSocial rede = new Facebook();
        RedeSocial rede2 = new Twitter();

        rede.curtir();
        rede.postar();

        rede2.curtir();
        rede2.postar();
    }
}