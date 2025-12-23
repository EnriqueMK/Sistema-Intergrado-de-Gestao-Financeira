package src.app;

import src.model.Cliente;
import src.model.Credito;

public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("Enrique", "50690239858", "11968746930", "Rua Vulnerária, 58");
            Credito credito = new Credito(cliente, 1000);
            cliente.cadastroCliente();
            cliente.adicionarCartao(credito);
            credito.informacoesCartao();
        } catch (IllegalArgumentException erro) {
            System.err.println("Erro: " + erro.getMessage());
        } catch (Exception erroInes) {
            System.err.println("Erro inesperado: " + erroInes.getMessage());
        } finally {
            System.out.printf("%nProcesso finalizado.");
        }
    }
}