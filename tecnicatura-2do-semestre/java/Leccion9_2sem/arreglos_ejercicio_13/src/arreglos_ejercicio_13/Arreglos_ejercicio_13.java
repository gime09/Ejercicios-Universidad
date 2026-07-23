//Leer 10 enteros en una tabla, guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares.


package arreglos_ejercicio_13;
import java.util.Scanner;
public class Arreglos_ejercicio_13 {

    
    public static void main(String[] args) {
        
        
     Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] resultado = new int[10];
        int contadorPares = 0;
        int contadorImpares = 0;
            
        
     // Leer 10 números
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }   
        
        
     // Primero guardamos los pares
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                resultado[contadorPares] = numeros[i];
                contadorPares++;
            }
        }
        
        // Luego guardamos los impares
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 != 0) {
                resultado[contadorPares + contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }
        
        // Mostrar el resultado
        System.out.println("\nArray resultante (pares seguidos de impares):");
        for (int i = 0; i < 10; i++) {
            System.out.print(resultado[i] + " ");
        }
        
        scanner.close();    
        
        
        
        
        
        
        
        
    }
    
}
