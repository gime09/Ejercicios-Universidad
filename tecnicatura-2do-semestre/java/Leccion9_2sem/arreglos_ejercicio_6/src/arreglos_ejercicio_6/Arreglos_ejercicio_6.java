
//Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y transponerla en la segunda.


package arreglos_ejercicio_6;

import java.util.Scanner;
public class Arreglos_ejercicio_6 {

   
    public static void main(String[] args) {
        
        
       Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[5][9];
        int[][] matriz2 = new int[9][5];
        
        // Cargar la primera matriz
        System.out.println("Introduce los elementos de la matriz 5x9:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        
        // Transponer la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }
        
        // Mostrar la matriz original
        System.out.println("\nMatriz original (5x9):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Mostrar la matriz transpuesta
        System.out.println("\nMatriz transpuesta (9x5):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
