package src.validation;

public final class TelefoneValidar {

    private TelefoneValidar() {}
    public static String validar(String telefone) {
        if (telefone == null || telefone.isBlank()) { throw new IllegalArgumentException("O telefone não pode estar vazio."); }
        telefone = telefone.trim();
        
        if (telefone.contains(" ")) { throw new IllegalArgumentException("O telefone não pode conter espaços."); }
        if (!telefone.matches("^[0-9]{10,11}$")) { throw new IllegalArgumentException("O telefone deve conter entre 10 e 11 números."); }

        return telefone;
    }
}
