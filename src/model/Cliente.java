package src.model;

import src.validation.CartaoValidar;
import src.validation.CpfValidar;
import src.validation.EnderecoValidar;
import src.validation.NomeValidar;
import src.validation.TelefoneValidar;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private Cartao cartao;

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        this.nome = NomeValidar.validar(nome);
        this.cpf = CpfValidar.validar(cpf);
        this.telefone = TelefoneValidar.validar(telefone);
        this.endereco = EnderecoValidar.validar(endereco);
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }

    public void setNome(String nome) { this.nome = NomeValidar.validar(nome); }
    public void setTelefone(String telefone) { this.telefone = TelefoneValidar.validar(telefone); }
    public void setEndereco(String endereco) { this.endereco = EnderecoValidar.validar(endereco); }

    public void adicionarCartao(Cartao cartao) { CartaoValidar.validar(this, cartao); this.cartao = cartao; }
    public Cartao getCartao() { return cartao; }

    public void cadastroCliente() {
        System.out.println("\nOlá " + getNome() + " Sejá Bem-vindo ao seu Banco!");
        System.out.println("=================================");
        System.out.println("SEU CADASTRO");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
    } 
}
