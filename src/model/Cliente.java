package src.model;

import src.validation.NomeValidar;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        this.nome = NomeValidar.validar(nome);
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }


    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }
    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public void cadastroCliente() {
        System.out.println("\nOlá " + getNome() + " Sejá Bem-vindo ao seu Banco!");
        System.out.println("=================================");
        System.out.println("SEU CADASTRO");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
    } 
}
