import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        int edad;

        do {
            System.out.print("Ingrese su edad: ");
            edad = Entrada.nextInt();

            if (edad < 1 || edad > 150) {
                System.out.println("Edad no válida. Intente nuevamente.");
            }
        } while (edad < 1 || edad > 150);

        Entrada.close();

        System.out.println("Edad ingresada: " + edad);
    }
}
