/*
Ejercicio3: Leer 5 números por teclado, almacenarlos en 
un arreglo y a continuación realizar la media de los
números positivos, la media de los negativos y contar el 
número de ceros. 
*/



package arreglos_ejercicio_3;
import java.util.Scanner;

public class Arreglos_ejercicio_3 {
    
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; // Arreglo para guardar los números

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int conteoPositivos = 0;
        int conteoNegativos = 0;
        int conteoCeros = 0;

        // Leer los números y almacenarlos en el arreglo
        System.out.println("Introduce 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Clasificar el número como positivo, negativo o cero
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                conteoPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                conteoNegativos++;
            } else {
                conteoCeros++;
            }
        }

        // Calcular la media de los números positivos y negativos
        double mediaPositivos = (conteoPositivos > 0) ? (double) sumaPositivos / conteoPositivos : 0;
        double mediaNegativos = (conteoNegativos > 0) ? (double) sumaNegativos / conteoNegativos : 0;

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + conteoCeros);
    } 
    
    
    
    
    
}
