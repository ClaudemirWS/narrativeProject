package teste3poo;

/**
 * @author Claudemir Souza
 */
public abstract class Conta {

    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void imprimirExtrato();
}
