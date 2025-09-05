package org.example;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cartao cliente = new CartaoCredito(5000, "Jorge", new Date());
        Cartao cliente2 = new BoletoBancario(3000, "Marcia");

        Pagamento notebook = new Pagamento(2000);
        Pagamento teclado = new Pagamento(500);

        notebook.realizarPagamento(cliente);
        teclado.realizarPagamento(cliente2);

        System.out.println(cliente);
        System.out.println(cliente2);

    }
}