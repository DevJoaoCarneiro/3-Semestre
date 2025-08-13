public class ContaCorrente extends Banco {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    protected boolean realizarTransacao(double valor) {
        return valor>0;
    }

    @Override
    public void deposito(double valor) {
        if(realizarTransacao(valor)){
            double saldoAtualizado = valor + getSaldo();
            setSaldo(saldoAtualizado);
            System.out.println("Deposito efetuado com sucesso -> Novo Saldo.."+getSaldo());
        }else{
            throw new IllegalArgumentException("Saque invalido");
        }

    }

    @Override
    public void saque(double valor) {
        if(realizarTransacao(valor) && valor <= getSaldo()){
            double saldoAtualizado = getSaldo() - valor;
            setSaldo(saldoAtualizado);
            System.out.println("Saque efetuado com sucesso -> Novo Saldo.."+getSaldo());
        }else{
            throw new IllegalArgumentException("Saque invalido");
        }

    }
}
