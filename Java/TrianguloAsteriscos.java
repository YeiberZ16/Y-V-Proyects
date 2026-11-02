import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura del triangulo: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Espacios para centrar
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            int ancho = 2 * i - 1;

            if (i <= 2 || i == n) {
                // Punta (2 primeras filas) y base: linea completa
                for (int j = 1; j <= ancho; j++) {
                    System.out.print("*");
                }
            } else {
                // Bordes de 2 asteriscos de ancho
                System.out.print("**");
                for (int j = 1; j <= ancho - 4; j++) {
                    System.out.print(" ");
                }
                System.out.print("**");
            }

            System.out.println();
        }

        scanner.close();
    }
}
