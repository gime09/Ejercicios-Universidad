package arreglos_ejercicio_12;

// Leer una tabla de 10 elementos numéricos, eliminar un elemento de una posición
// específica (entre 0 y 9) y reorganizar el arreglo sin dejar huecos.


import java.util.Scanner;

public class Arreglos_Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];
        int posicion;

        // Leer los 10 números
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tabla[i] = scanner.nextInt();
        }

        // Leer la posición a eliminar
        do {
            System.out.print("Introduce la posición (entre 0 y 9) del número que quieres eliminar: ");
            posicion = scanner.nextInt();
        } while (posicion < 0 || posicion >= tabla.length);

        // Eliminar el elemento y mover los restantes
        for (int i = posicion; i < tabla.length - 1; i++) {
            tabla[i] = tabla[i + 1];
        }

        // Mostrar el arreglo resultante (sin el último elemento)
        System.out.println("Arreglo después de eliminar el número:");
        for (int i = 0; i < tabla.length - 1; i++) {
            System.out.print(tabla[i] + " ");
        }
    }
}
