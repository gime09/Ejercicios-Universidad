package arreglos_ejercicio_15;
//  Leer 10 enteros ordenados crecientemente, leer N y buscarlo en la tabla. Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
import java.util.Scanner;
public class Arreglos_ejercicio_15 {

   
    public static void main(String[] args) {
       
      Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        // Leer 10 números ordenados crecientemente
        System.out.println("Introduce 10 números ordenados crecientemente:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
            // Verificar que está ordenado
            if (i > 0 && numeros[i] < numeros[i-1]) {
                System.out.println("Error: Los números deben estar ordenados crecientemente");
                return;
            }
        }
        
        // Leer el número N a buscar
        System.out.print("\nIntroduce el número a 1buscar: ");
        int N = scanner.nextInt();
        
        // Búsqueda binaria (más eficiente para arrays ordenados)
        int inicio = 0;
        int fin = numeros.length - 1;
        int posicion = -1;
        
        while (inicio <= fin && posicion == -1) {
            int medio = (inicio + fin) / 2;
            
            if (numeros[medio] == N) {
                posicion = medio;
            } else if (numeros[medio] < N) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        
        // Mostrar resultado
        if (posicion != -1) {
            System.out.println("El número " + N + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El número " + N + " no se encuentra en el array");
        }
        
        scanner.close();  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
