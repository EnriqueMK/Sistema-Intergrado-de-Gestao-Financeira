package src.validation.Cartao;

import src.model.Cartao;
import src.model.Cliente;

// Classe não herdável
public final class CartaoValidar {

    // Construtor não instanciável
    private CartaoValidar() {}

    // Método que valida a entrada de dado Cartao
    public static void validar(Cliente cliente, Cartao cartao) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não pode ser nulo.");
        }

        if (cartao == null) {
            throw new IllegalArgumentException("Cartão não pode ser nulo.");
        }

        if (cliente.getCartao() != null) {
            throw new IllegalStateException("Cliente já possui cartão.");
        }

        if (cartao.getCliente() != cliente) {
            throw new IllegalArgumentException("Cartão não pertence a este cliente.");
        }
    }
}
