import java.util.Scanner;
public class TemSemana {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] temperaturas = new double[7]; //Se crea un arreglo de 7 espacios para la temperatura de la semana.

            for (int i = 0; i < 7; i++) { //Se hace un ciclo para que el usuario ingrese la temperatura de cada día de la semana.
                System.out.print("Ingrese la temperatura del día " + (i + 1) + ": ");
                temperaturas[i] = sc.nextDouble();
            }
            double max = temperaturas[0]; //Se inicia la variable max con la primera temperatura.
            double min = temperaturas[0]; //Se inicia la variable min con la primera temperatura.
            int diaMax = 1; int diaMin = 1; //Se inicia la variable diaMax y diaMin con el primer día de la semana.

            for (int i = 1; i < 7; i++) {
                if (temperaturas[i] > max) {
                    max = temperaturas[i]; //Si la temperatura del día actual es mayor que la temperatura máxima, se actualiza la variable max con la nueva temperatura.
                    diaMax = i + 1; //Se actualiza el día de la semana en el que se registró la temperatura máxima.
                }
                if (temperaturas[i] < min) {
                    min = temperaturas[i]; //Si la temperatura del día actual es menor que la temperatura mínima, se actualiza la variable min con la nueva temperatura.
                    diaMin = i + 1; //Se actualiza el día de la semana en el que se registró la temperatura mínima.
                }
            }
            System.out.println("\n--------RESULTADOS--------");
            System.out.println("Temperatura máxima: " + max + "°C, registrada el día " + diaMax); //Se muestra la temperatura máxima y el día en el que se registró.
            System.out.println("Temperatura mínima: " + min + "°C, registrada el día " + diaMin); //Se muestra la temperatura mínima y el día en el que se registró.
            System.out.println("Diferencia entre temperaturas: " + (max - min) + "°C"); //Se muestra la diferencia entre la temperatura máxima y mínima.
            
            sc.close();
        }
    }
}