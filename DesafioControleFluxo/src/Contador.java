import java.util.Scanner;
import exception.ParametrosInvalidosException;



public class Contador {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int param1 = console.nextInt();
        
        System.out.println("Digite o primeiro parâmetro");
        int param2 = console.nextInt();

        try {
            contar(param1, param2);
        } catch (Exception e) {
            // System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            System.out.println(e);
        }
    }


    public static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) {
            throw new ParametrosInvalidosException();
        }

        int limit = param2 - param1;
        int count = 1;

        do {
            System.out.println(String.format("Imprimindo o número %s", count));
            count++;
        } while (count <= limit);
    }
}
