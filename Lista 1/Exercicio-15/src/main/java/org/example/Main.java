package org.example;

public class Main {
    public static void main(String[] args) {
        Document doc = new Pdf();
        Document doc2 = new World();

        doc.gerarDocumento();
        doc2.gerarDocumento();
    }
}