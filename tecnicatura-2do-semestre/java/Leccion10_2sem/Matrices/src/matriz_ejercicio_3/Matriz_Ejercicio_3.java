/*
Ejercicio3: Crear y cargar una matriz de tamaño 3X3, transponerla y mostrarla.
*/

package matriz_ejercicio_3;
import java.util.Scanner;

public class Matriz_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int matriz[][] = new int[3][3];  // Definir una matriz de 3x3
        
        // Llenado de la matriz
        System.out.println("Ingrese los elementos de la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Mostrar la matriz original
        System.out.println("\nMatriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Transponer la matriz
        int transpuesta[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        
        // Mostrar la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
