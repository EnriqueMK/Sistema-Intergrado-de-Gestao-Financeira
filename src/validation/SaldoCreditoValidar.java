package src.validation;

public final class SaldoCreditoValidar {

    private SaldoCreditoValidar() {}
    public double validar(Double limite) {
        if (limite == null) {
            throw new IllegalArgumentException("O limite não pode estar vazio.");
        }
        if (limite.isNaN() || limite.isInfinite()) {
            throw new IllegalArgumentException("O limite é inválido.");
        }
        if (limite < 200.0 || limite > 100000.0) {
            throw new IllegalArgumentException("O limite deve conter entre R$ 200,00 a R$ 100.000.");
        }

        return limite;
    }
}
