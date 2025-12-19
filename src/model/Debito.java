package src.model;

public class Debito extends Cartao {
    private double saldo;

    public Debito(double saldo) {
        this.saldo = 0;
    }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    @Override
    public void exibirDadosCartao() {
        System.out.println("Número do Cartão: " + getNumero());
        System.out.println("CVV: " + getCvv());
        System.out.println("Vencimento: " + getDataVenc());
        System.out.println("Saldo: " + saldo);
    }

    
}
