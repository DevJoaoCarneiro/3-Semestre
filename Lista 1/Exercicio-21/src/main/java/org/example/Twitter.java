package org.example;

public class Twitter extends RedeSocial{
    @Override
    public void postar() {
        System.out.println("Postado no twitter");
    }

    @Override
    public void curtir() {
        System.out.println("Curtido no twitter");

    }
}
