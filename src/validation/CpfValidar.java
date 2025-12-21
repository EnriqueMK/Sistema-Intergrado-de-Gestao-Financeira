package src.validation;

public final class CpfValidar {

    private CpfValidar() {}
    public static String validar(String cpf) {
        // Validação da entrada de dado cpf.
        if (cpf == null || cpf.isBlank()) { throw new IllegalArgumentException("O CPF não pode estar vazio."); }
        cpf = cpf.trim();
        
        if (cpf.contains(" ")) { throw new IllegalArgumentException("O CPF não pode conter espaços."); }
        if (!cpf.matches("^[0-9]{11}$")) { throw new IllegalArgumentException("O CPF deve conter exatamente 11 números."); }
        return cpf;
    }
}
