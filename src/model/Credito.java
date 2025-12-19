package src.model;

public class Credito extends Cartao {
    private double limite;
    protected double limiteGasto;


    public Credito(double limite) { super(); this.limite = limite; }

    @Override
    public void exibirDadosCartao() {
        System.out.println("Número do Cartão: " + getNumero());
        System.out.println("CVV: " + getCvv());
        System.out.println("Vencimento: " + getDataVenc());
        System.out.println("Limite: " + limite);
    }
}
