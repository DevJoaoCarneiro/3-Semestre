public abstract class Banco {
    private double saldo;

    public Banco(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected abstract boolean realizarTransacao(double valor);
    public abstract void deposito(double valor);
    public abstract void saque(double valor);
}
