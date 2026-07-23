/*
Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma
de cada fila y de cada columna.
*/


package matriz_ejercicio_5;

import java.util.Scanner;
public class Matriz_Ejercicio_5 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el tamaño de la matriz
        System.out.print("Ingrese el número de filas (n): ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m]; // Crear la matriz de tamaño n x m

        // Llenar la matriz con valores ingresados por el usuario
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcular y mostrar la suma de cada fila
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila " + i + ": " + sumaFila);
        }

        // Calcular y mostrar la suma de cada columna
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < m; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma de la columna " + j + ": " + sumaColumna);
        }
    } 
}
