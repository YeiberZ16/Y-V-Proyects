import java.util.Scanner;
public class InDaClPo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        int[] numeros = new int[10]; 
        int suma = 0, positivos = 0, negativos = 0, ceros = 0;

        for (int i = 0; i < 10; i++) { //Se hace un ciclo para que el usuario ingrese 10 números.
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (i % 2 == 0) { //Se verifica si el índice es par, si es así, se suma el número a la variable suma.
                suma += numeros[i];
            }
            if (numeros[i] > 0) { //Se verifica si el número es positivo, si es así, se incrementa la variable positivos.
                positivos++;
            } else if (numeros[i] < 0) { //Se verifica si el número es negativo, si es así, se incrementa la variable negativos.
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("\nNumero en orden inverso:");
        for (int i = 9; i >= 0; i--) { //Se hace un ciclo para mostrar los números en orden inverso, desde el último índice hasta el primero.   
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nSuma de indices en posiciones pares: " + suma); 
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos); 
        System.out.println("Cantidad de ceros: " + ceros); 

        sc.close();
        }
    }
}