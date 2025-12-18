package src.model;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;

    private Cartao cartao;

    public Cliente(String nome, String cpf, String telefone, String endereco, Cartao cartao) {
        this.nome = nome;
        this.cpf = cpf; 
        this.telefone = telefone;
        this.endereco = endereco;
        this.cartao = cartao;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }
    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public void exibirDadosCliente() {
        System.out.println("Olá " + getNome() + " Sejá Bem-vindo ao seu Banco!");
        System.out.println("=================================");
        System.out.println("Seu cadastro");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());

        if (cartao != null) {
            cartao.exibirDadosCartao();
        } else {
            System.out.println("Cliente ainda não possui cartão cadastrado.");
        }
    } 
}
