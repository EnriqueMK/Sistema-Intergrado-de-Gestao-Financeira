package src.app;

import src.model.Cliente;
import src.model.Credito;

public class Main {
    
    public static void main(String[] args) {
        Credito credito = new Credito(1000);
        Cliente cliente = new Cliente("Enrique", "50690239858", "11968746930", "Rua Vulneraria", credito);

        cliente.exibirDadosCliente();

    }
}
