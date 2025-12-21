package src.model;

public class Debito extends Cartao {
    private double saldo;

    public Debito(double saldo) { this.saldo = 0; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public String exibirSaldo() { return "Saldo: " + getSaldo(); }

    @Override
    public void informacoesCartao() {
        System.out.println("\nCADASTRO DO SEU CARTÃO DE DÉBITO");
        System.out.println("Número do Cartão: " + getNumero());
        System.out.println("CVV: " + getCvv());
        System.out.println("Vencimento: " + getDataVenc());
    }
}
