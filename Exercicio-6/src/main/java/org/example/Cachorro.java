package org.example;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void fazerSom() {
    System.out.println("Nome..."+getNome()+"..Som...Au Au");
    }
}
