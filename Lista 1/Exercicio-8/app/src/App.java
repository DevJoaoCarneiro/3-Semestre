public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente conta1 = new ContaCorrente(2000);
        ContaCorrente conta2 = new ContaCorrente(3500);

        conta1.saque(1000);
        conta1.deposito(5000);

        conta2.saque(170);
        conta2.deposito(1000);
    }
}
