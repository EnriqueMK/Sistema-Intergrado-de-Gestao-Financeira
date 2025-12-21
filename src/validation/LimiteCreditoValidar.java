package src.validation;

public final class LimiteCreditoValidar {

    private LimiteCreditoValidar() {}
    
    public double validar(double limite) {
        if (limite < 200.0 || limite > 100000.0) {
            throw new IllegalArgumentException("O limite deve conter entre R$ 200,00 a R$ 100.000.");
        }

        return limite;
    }
}
