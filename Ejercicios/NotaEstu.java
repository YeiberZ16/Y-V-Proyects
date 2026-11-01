import java.util.Scanner;
public class NotaEstu {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Cantidad de estudiantes: "); //Cantidad de estudiantes
            int n = sc.nextInt(); //lee la cantidad de estudiantes que ingresa el usuario

            double[] notas = new double[n]; //puede usar decimales y el new double puede tener el tamaño que se ingrese.
            double suma = 0; //Se acumula las notas.
            int aprobados = 0, reprobados = 0; //para calcular si el estudiante saco una nota arriba de 3 o abajo.

            for (int i = 0; i < n; i++) {  //Permite que el ciclo se ejecute en base a la cantidad de estudiantes que el usuario puso.
                System.out.print("Nota del estudiante " + (i + 1) + ": ");
                notas[i] = sc.nextDouble();

                while (notas[i] < 0 || notas[i] > 5) { //este ciclo permite que la nota este entre 0 y 5, si no lo está, el ciclo se repite hasta que el usuario ingrese una nota correcta.
                    System.out.print("Ingrese una nota entre 0,0 y 5,0: ");
                    notas[i] = sc.nextDouble();
                }
                suma = suma + notas[i]; //Se suman las notas del numero de estudiantes que se ingreso

                if (notas[i] >= 3) {
                    aprobados++;
                } else {               //aqui se clasifica cada estudiante en aprobado o reprobado, si la nota es mayor o igual a 3, se suma un aprobado, si no, se suma un reprobado.
                    reprobados++;
                } 
            }
            System.out.printf("Promedio: %.2f%n", suma / n); //Se muestra los resltado, la suma de las notas y la divivion de ellas.
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Reprobados: " + reprobados);

            sc.close();
        }
    }
}