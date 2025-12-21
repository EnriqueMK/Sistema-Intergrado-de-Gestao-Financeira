package src.model;

import java.time.YearMonth;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Cartao {

    private String numero;
    private int cvv;
    private YearMonth dataVenc;

    public Cartao() {
        this.numero = (
            ThreadLocalRandom.current().nextInt(1000, 10000)) + " " 
        + (ThreadLocalRandom.current().nextInt(1000, 10000)) + " " 
        + (ThreadLocalRandom.current().nextInt(1000, 10000)) + " " 
        + (ThreadLocalRandom.current().nextInt(1000, 10000));

        this.cvv = ThreadLocalRandom.current().nextInt(100, 1000);

        YearMonth venc = YearMonth.now().plusYears(3);
        this.dataVenc = venc;
    }

    public String getNumero() { return numero; }
    public int getCvv() { return cvv; }
    public YearMonth getDataVenc() { return dataVenc; }
    public abstract void informacoesCartao();
}
