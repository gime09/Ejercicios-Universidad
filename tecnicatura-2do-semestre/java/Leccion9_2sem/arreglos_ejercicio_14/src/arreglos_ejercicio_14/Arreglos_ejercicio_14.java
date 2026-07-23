//Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.


package arreglos_ejercicio_14;
import java.util.Scanner;
public class Arreglos_ejercicio_14 {

    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        int[] serie1 = new int[10];
        int[] serie2 = new int[10];
        int[] resultado = new int[20];
        
        // Leer primera serie
        System.out.println("Introduce 10 números ordenados crecientemente (serie 1):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            serie1[i] = scanner.nextInt();
            // Verificar que está ordenado
            if (i > 0 && serie1[i] < serie1[i-1]) {
                System.out.println("Error: Los números deben estar ordenados crecientemente");
                return;
            }
        }
        
        // Leer segunda serie
        System.out.println("\nIntroduce 10 números ordenados crecientemente (serie 2):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            serie2[i] = scanner.nextInt();
            // Verificar que está ordenado
            if (i > 0 && serie2[i] < serie2[i-1]) {
                System.out.println("Error: Los números deben estar ordenados crecientemente");
                return;
            }
        }
        
        // Fusionar las series ordenadamente
        int i = 0, j = 0, k = 0;
        while (i < 10 && j < 10) {
            if (serie1[i] <= serie2[j]) {
                resultado[k] = serie1[i];
                i++;
            } else {
                resultado[k] = serie2[j];
                j++;
            }
            k++;
        }
        
        // Agregar elementos restantes de serie1 si hay
        while (i < 10) {
            resultado[k] = serie1[i];
            i++;
            k++;
        }
        
        // Agregar elementos restantes de serie2 si hay
        while (j < 10) {
            resultado[k] = serie2[j];
            j++;
            k++;
        }
        
        // Mostrar el resultado
        System.out.println("\nArray resultante ordenado:");
        for (i = 0; i < 20; i++) {
            System.out.print(resultado[i] + " ");
        }
        
        scanner.close(); 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
