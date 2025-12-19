import java.util.Stack;

public class index {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.println(pilha);
        }
        
    }
}
