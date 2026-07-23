
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

   
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        
        // Pedir las calificaciones al usuario
        System.out.println("Ingrese la primera calificación: ");
        double calificacion1 = scanner.nextDouble();
        
        System.out.println("Ingrese la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();
        
        System.out.println("Ingrese la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();
        
        // Calcular la suma de las calificaciones
        double suma = calificacion1 + calificacion2 + calificacion3;
        
        // Imprimir la suma
        System.out.println("La suma de las tres calificaciones es: " + suma);
        
        scanner.close();
       
        
        
    }
    
}
