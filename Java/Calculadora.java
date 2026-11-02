import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");

            int opcion;
            do {
                System.out.print("Seleccione una opción (1-4): ");
                opcion = scanner.nextInt();
                if (opcion < 1 || opcion > 4) {
                    System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion < 1 || opcion > 4);

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;
            boolean valido = true;

            switch (opcion) {
                case 1: resultado = num1 + num2; break;
                case 2: resultado = num1 - num2; break;
                case 3: resultado = num1 * num2; break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                        valido = false;
                    }
                    break;
            }

            if (valido) {
                System.out.println("Resultado: " + resultado);
            }

            // Enter = repetir, s + Enter= salir
            System.out.print("Presione Enter para una nueva operación, o \"s\" para salir: ");
            scanner.nextLine(); // limpia el salto de línea pendiente
            String respuesta = scanner.nextLine().trim().toLowerCase();
            continuar = !respuesta.equals("s");
            System.out.println();
        }

        System.out.println("Calculadora finalizada. ¡Hasta luego !");
        scanner.close();
    }
}