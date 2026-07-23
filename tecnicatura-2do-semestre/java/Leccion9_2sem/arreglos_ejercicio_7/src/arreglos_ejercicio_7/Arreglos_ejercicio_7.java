
package arreglos_ejercicio_7;

// Crear una matriz  "marco" de tamaño 5x5 todos sus elementos deben ser 0 salvo los bordes que deben ser 1 . Mostrarla

public class Arreglos_ejercicio_7 {

  
    public static void main(String[] args) {
        
         // Crear matriz 5x5
        int[][] matriz = new int[5][5];
        
        // Rellenar la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // Si estamos en la primera o última fila, o en la primera o última columna
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    matriz[i][j] = 1;  // Borde
                } else {
                    matriz[i][j] = 0;  // Interior
                }
            }
        }
        
        // Mostrar la matriz
        System.out.println("Matriz marco 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }  
        
        
        
        
        
    }
    
}
