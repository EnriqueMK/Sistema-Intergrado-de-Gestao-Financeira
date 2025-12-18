package src.model;

public abstract class Cliente {

    private String nome;
    private long cpf;
    private long telefone;
    private String endereco;
    protected double saldoInicial;

    public Cliente(String nome, long cpf, long telefone, String endereco, double saldoInicial)
     {
        
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode estar vazio.");
        } else if (nome.length() < 3 || nome.length() > 50) {
            throw new IllegalArgumentException("Nome deve ter entre 3 e 50 caracteres.");
        } else if (!nome.matches("[a-zA-ZÀ-ÿ\\s]+")) {
            throw new IllegalArgumentException("Nome deve conter apenas letras e espaços.");
        }

        if (cpf > 10000000000L || cpf < 10000000000L) {
            throw new IllegalArgumentException("CPF deve conter exatamente 11 dígitos numéricos.");
        }

        if (telefone < 10000000000L || telefone > 99999999999L) {
            throw new IllegalArgumentException("Telefone deve conter exatamente 11 dígitos numéricos.");
        }

        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("Endereço não pode estar vazio.");
        } else if (endereco.length() < 5 || endereco.length() > 100) {
            throw new IllegalArgumentException("Endereço deve ter entre 5 e 100 caracteres.");
        } else if (!endereco.matches("[a-zA-Z0-9À-ÿ\\s,.-]+")) {
            throw new IllegalArgumentException("Endereço deve conter apenas letras, números, espaços e os caracteres (, . -)");
        }

        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.saldoInicial = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSaldo() {
        return saldoInicial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
