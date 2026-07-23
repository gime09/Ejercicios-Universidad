package arreglos_ejercicio_11;

// Leer 5 elementos numéricos en una tabla de tamaño 10, ordenarlos de forma creciente, y luego insertar un número adicional en la posición correcta para mantener el orden.


import java.util.Scanner;

public class Arreglos_Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];
        int num, pos = 0;

        // Leer los 5 números ordenados
        System.out.println("Introduce 5 números de forma ordenada:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tabla[i] = scanner.nextInt();
            if (i > 0 && tabla[i] < tabla[i - 1]) {
                System.out.println("Por favor, introduce un número mayor o igual al anterior.");
                i--; // Repetir entrada si no es creciente
            }
        }

        // Leer el nuevo número a insertar
        System.out.print("Introduce un número para insertar: ");
        num = scanner.nextInt();

        // Determinar la posición donde debe insertarse
        for (int i = 0; i < 5; i++) {
            if (num < tabla[i]) {
                pos = i;
                break;
            }
            pos = i + 1;
        }

        // Mover los elementos para hacer espacio
        for (int i = 5; i > pos; i--) {
            tabla[i] = tabla[i - 1];
        }

        // Insertar el nuevo número
        tabla[pos] = num;

        // Mostrar el arreglo resultante
        System.out.println("Arreglo después de insertar el número:");
        for (int i = 0; i < 6; i++) {
            System.out.print(tabla[i] + " ");
        }
    }
}
