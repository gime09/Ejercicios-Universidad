
package clase12_ej3;

import java.util.Scanner;


public class Clase12_ej3 {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Solicitar las calificaciones al usuario
        System.out.print("Ingresa la calificación de participación: ");
        double participacion = scanner.nextDouble();

        System.out.print("Ingresa la calificación del primer examen parcial: ");
        double primerParcial = scanner.nextDouble();

        System.out.print("Ingresa la calificación del segundo examen parcial: ");
        double segundoParcial = scanner.nextDouble();

        System.out.print("Ingresa la calificación del examen final: ");
        double examenFinal = scanner.nextDouble();

        // Calcular la calificación final con las ponderaciones
        double calificacionFinal = (participacion * 0.10) + 
                                   (primerParcial * 0.25) + 
                                   (segundoParcial * 0.25) + 
                                   (examenFinal * 0.40);

        // Mostrar el resultado
        System.out.println("La calificación final es: " + calificacionFinal);

        scanner.close();
        
              
        
    }
    
}
