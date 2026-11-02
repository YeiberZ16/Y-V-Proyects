import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos terminos de Fibonacci? ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Primeros " + n + " terminos:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        System.out.println();
        scanner.close();
    }
}
