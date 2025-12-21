package src.validation;

import src.model.Cartao;
import src.model.Cliente;

public final class CartaoValidar {

    private CartaoValidar() {}
    public static void validar(Cliente cliente, Cartao cartao) {

        if (cliente == null) { throw new IllegalArgumentException("O cliente não pode ser nulo."); }
        if (cartao == null) { throw new IllegalArgumentException("O cartão não pode ser nulo."); }
        if (cliente.getCartao() != null) { throw new IllegalStateException("O cliente já possui um cartão cadastrado."); }
        if (cartao.getCliente() != cliente) {throw new IllegalArgumentException("O cartão não pertence a este cliente."); }
    }
}
