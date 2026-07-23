package arreglos_ejercicio_4;

import java.util.Scanner;

// Leer 10 números enteros, guardarlos en un arreglo, y mostrarlos en el siguiente orden: primero, último, segundo, penúltimo, tercero, etc.

public class arreglos_Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer los números
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números en el orden solicitado
        System.out.println("Números en el orden requerido:");
        for (int i = 0; i < numeros.length / 2; i++) {
            System.out.print(numeros[i] + " "); // Primeros elementos
            System.out.print(numeros[numeros.length - 1 - i] + " "); // Últimos elementos
        }
        // Si la longitud es impar, mostrar el del medio (no aplica aquí porque es 10).
    }
}
