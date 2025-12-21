package src.app;

import src.model.Cliente;

public class Main {
    public static void main(String[] args) {

        try {
            Cliente cliente = new Cliente("ass", "50690239858", "11968746930", "Rua Vulnerária, 58");
            cliente.cadastroCliente();
        } catch (IllegalArgumentException erro) {
            System.err.println("Erro: " + erro.getMessage());
        } catch (Exception erroInes) {
            System.err.println("Erro inesperado: " + erroInes.getMessage());
        } finally {
            System.out.println("Processo finalizado.");
        }        

    }
}
