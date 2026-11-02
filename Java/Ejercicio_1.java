import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {


        Scanner Entrada = new Scanner(System.in);

        int edad;

        do {
            System .out.print("Ingrese su edad: ");
            edad = Entrada.nextInt();

            if (edad < 1) {
                System.out.println("Edad no válida. Intente nuevamente.");
            } else if (edad < 18) {
                System.out.println("Eres menor de edad.");
            } else {
                System.out.println("Eres mayor de edad.");
            }
        } while (edad < 1);

        Entrada.close();
    }
}