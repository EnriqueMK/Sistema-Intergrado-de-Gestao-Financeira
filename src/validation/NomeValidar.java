package src.validation;

public final class NomeValidar {

    private NomeValidar() {}
    
    public static String validar(String nome) {
        if (nome == null || nome.isBlank()) { throw new IllegalArgumentException("O nome não pode estar vazio."); }
        nome = nome.trim();

        if (!nome.matches("^[\\p{L} ]+$")) { throw new IllegalArgumentException("O nome deve conter apenas letras."); }
        if (nome.length() < 3 || nome.length() > 50) { throw new IllegalArgumentException("O nome deve conter entre 3 e 50 caracteres."); }

        return nome;
    }
}
