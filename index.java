import java.util.Random;
import java.time.LocalDate;

public class index {
    public static Random random = new Random();
    public static void main(String[] args) {
        
        LocalDate add3 = LocalDate.now().plusYears(3);
        
        System.out.println(add3);
    }
}
