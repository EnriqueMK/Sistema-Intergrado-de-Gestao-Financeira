package src.model;

public class Credito extends Cartao {
    private double limite;

    public Credito(Cliente cliente, Double limite) { super(); this.limite = limite; }
    public double getLimite() { return limite; }
    public String exibirLimite() { return "Limite: " + getLimite(); }

    @Override
    public void informacoesCartao() {
        System.out.println("\nCADASTRO DO SEU CARTÃO DE CRÉDITO");
        System.out.println("Número do Cartão: " + getNumero());
        System.out.println("CVV: " + getCvv());
        System.out.println("Vencimento: " + getDataVenc());
    }
}
