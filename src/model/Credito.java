package src.model;

import src.validation.Credito.LimiteCreditoValidar;

public class Credito extends Cartao {
    
    private double limite;

    public Credito(Cliente cliente, double limite) {
        super(cliente);
        this.limite = LimiteCreditoValidar.validar(limite);
    }

    public void setLimite(double limite) {
        this.limite = LimiteCreditoValidar.validar(limite);
    }

    @Override
    public void informacoesCartao() {
        System.out.println("\nCADASTRO DO SEU CARTÃO DE CRÉDITO");
        System.out.println("Número do Cartão: " + getNumero());
        System.out.println("CVV: " + getCvv());
        System.out.println("Vencimento: " + getDataVenc());
        System.out.println("Limite: " + limite);
    }
}
