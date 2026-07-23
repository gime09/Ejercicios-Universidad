package arreglos_ejercicio_5;

// Leer dos tablas de 10 números enteros y mezclarlas en una tercera, alternando elementos de ambas tablas (1° de A, 1° de B, 2° de A, 2° de B, etc.).

import java.util.Scanner;

public class arreglos_ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaC = new int[20];

        // Leer los números para la tabla A
        System.out.println("Introduce 10 números para la tabla A:");
        for (int i = 0; i < tablaA.length; i++) {
            System.out.print("A[" + i + "]: ");
            tablaA[i] = scanner.nextInt();
        }

        // Leer los números para la tabla B
        System.out.println("Introduce 10 números para la tabla B:");
        for (int i = 0; i < tablaB.length; i++) {
            System.out.print("B[" + i + "]: ");
            tablaB[i] = scanner.nextInt();
        }

        // Mezclar en la tabla C
        int j = 0;
        for (int i = 0; i < tablaA.length; i++) {
            tablaC[j++] = tablaA[i];
            tablaC[j++] = tablaB[i];
        }

        // Mostrar la tabla C
        System.out.println("Tabla mezclada (C):");
        for (int i = 0; i < tablaC.length; i++) {
            System.out.print(tablaC[i] + " ");
        }
    }
}
