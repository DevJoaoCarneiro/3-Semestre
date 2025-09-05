package org.example;

public class Vetor {
    private int x;
    private int y;

    public Vetor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Vetor somar(Vetor outro) {
        return new Vetor(this.x + outro.x, this.y + outro.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
